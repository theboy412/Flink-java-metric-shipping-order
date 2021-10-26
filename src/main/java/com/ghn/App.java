package com.ghn;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.internals.KafkaTopicPartition;
import org.codehaus.plexus.util.StringUtils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class App {
    public static final Map<String, List<String>> METRIC = new HashMap<String, List<String>>() {
        {
            put("M0", Arrays.asList("picked", "stored"));
            put("M1", Collections.singletonList("delivered"));
            put("M2", Collections.singletonList("returned"));
            put("M3", Collections.singletonList("delivered"));
            put("M4", Arrays.asList("picked", "storing", "transporting", "sorting", "delivery_fail", "money_collect_delivering", "delivering"));
            put("M5", Arrays.asList("return", "returning", "return_fail", "return_transporting", "return_sorting"));
            put("M6", Collections.singletonList("waiting_to_return"));
            put("M7", Arrays.asList("lost", "damage"));
            put("M8", Arrays.asList("delivered", "returned"));
            put("M9", Arrays.asList("picked", "storing", "transporting", "sorting"));
        }
    };
    public static final int INCREASE = 1;
    public static final int DECREASE = -1;
    public static final int STABLE = 0;

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "broker:9092");
        properties.setProperty("group.id", "FlinkTest");
        // Start consume from offset 0
        properties.setProperty("auto.offset.reset", "earliest");

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        env.enableCheckpointing(1000);
        FlinkKafkaConsumer<ShippingOrder> myConsumer = new FlinkKafkaConsumer<>("ShippingOrdersTest", new ShippingOrderSchema(), properties);

//        Map<KafkaTopicPartition, Long> specificStartOffsets = new HashMap<>();
//        specificStartOffsets.put(new KafkaTopicPartition("ShippingOrdersTest", 0), 23L);
//        myConsumer.setStartFromSpecificOffsets(specificStartOffsets);
        myConsumer.setStartFromEarliest();
        myConsumer.setCommitOffsetsOnCheckpoints(true);

        DataStream<ShippingOrder> stream = env.addSource(myConsumer).returns(ShippingOrder.class);

        DataStream<ShopMetric> output = stream
                .filter(so -> so.getOld() != null)
                .filter(
                        so -> !so.getOld().getData().getStatus().equals(so.getShippingOrderNew().getData().getStatus())
                )
                .filter(so -> so.getShippingOrderNew().getData().getLog() != null)
                .map((MapFunction<ShippingOrder, Tuple4<String, Long, Integer[], Integer>>) shippingOrder -> {
                    String pickedDate = "";
                    Long shopID = shippingOrder.getShippingOrderNew().getData().getShopID();
                    String oldStatus = shippingOrder.getOld().getData().getStatus();
                    String newStatus = shippingOrder.getShippingOrderNew().getData().getStatus();
                    Log[] logs = shippingOrder.getShippingOrderNew().getData().getLog();
                    Long codAmount = shippingOrder.getShippingOrderNew().getData().getCodAmount();
                    String codTransferDate = shippingOrder.getShippingOrderNew().getData().getCodTransferDate();
                    for (Log value : logs) {
                        if (value.getStatus().equals("picked") || value.getStatus().equals("stored")) {
                            Instant instant = Instant.parse(value.getUpdatedDate());
                            Date d = Date.from(instant);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd");
                            pickedDate = simpleDateFormat.format(d);
                            break;
                        }
                    }
                    List<String> metricDecrement = getMetricType(false, oldStatus, shippingOrder.getOld().getData().getLog(), codAmount, codTransferDate);
                    List<String> metricIncrement = getMetricType(true, newStatus, shippingOrder.getShippingOrderNew().getData().getLog(), codAmount, codTransferDate);
                    Integer[] m = calculateMetric(metricIncrement, metricDecrement);

                    /*
                     String orderCode = shippingOrder.getShippingOrderNew().getData().getOrderCode();
                     System.out.printf("order %s has old status %s and new status %s", orderCode, oldStatus, newStatus);
                     System.out.print(" decrease list: ");
                     System.out.println(metricDecrement);
                     System.out.print("increase list: ");
                     System.out.println(metricIncrement);
                    */

                    if (!pickedDate.equals("")) {
                        pickedDate += "_";
                    }

                    String metricID = pickedDate + String.valueOf(shopID);
                    return new Tuple4<>(metricID, shopID, m, 1);
                }).returns(Types.TUPLE(Types.STRING, Types.LONG, Types.OBJECT_ARRAY(Types.INT), Types.INT))
                .filter(so -> !StringUtils.isNumeric(so.f0))
                .keyBy(so -> so.f0)
                .reduce((ReduceFunction<Tuple4<String, Long, Integer[], Integer>>) (v1, v2) -> {
                    Integer[] result = new Integer[10];
                    for (int i = 0; i < 10; i++) {
                        result[i] = v1.f2[i] + v2.f2[i];
                    }
                    return new Tuple4<>(v1.f0, v1.f1, result, 1);
                }).returns(Types.TUPLE(Types.STRING, Types.LONG, Types.OBJECT_ARRAY(Types.INT), Types.INT))
                .map((MapFunction<Tuple4<String, Long, Integer[], Integer>, ShopMetric>) t -> {
                    ShopMetric sm = new ShopMetric();
                    sm.setM0(t.f2[0]);
                    sm.setM1(t.f2[1]);
                    sm.setM2(t.f2[2]);
                    sm.setM3(t.f2[3]);
                    sm.setM4(t.f2[4]);
                    sm.setM5(t.f2[5]);
                    sm.setM6(t.f2[6]);
                    sm.setM7(t.f2[7]);
                    sm.setM8(t.f2[8]);
                    sm.setM9(t.f2[9]);
                    sm.setShopID(t.f1);
                    sm.setMetricID(t.f0);
                    return sm;
                }).returns(ShopMetric.class);

        // Add data to Cassandra
//        CassandraSink.addSink(x)
//                .setQuery("INSERT INTO flink_test.example (id, counter) values (?, ?);")
//                .setClusterBuilder(new ClusterBuilder() {
//                    @Override
//                    protected Cluster buildCluster(Cluster.Builder builder) {
//                        return new Cluster.Builder().addContactPoint("35.240.217.49").addContactPoint("35.198.227.29").addContactPoint("34.126.102.148").withCredentials("cassandra", "LxWRoPsj8mwa").build();
//                    }
//                })
//                .setMapperOptions(() -> new Mapper.Option[]{Mapper.Option.saveNullFields(true)})
//                .build();
        env.execute("Flink Test 2");
    }

    public static List<String> getMetricType(boolean isNewStatus, String status, Log[] logs, Long codAmount, String codTransferDate) {
        List<String> result = new ArrayList<>(Collections.emptyList());
        for (Map.Entry<String, List<String>> value : METRIC.entrySet()) {
            if (value.getValue().contains(status)) {
                String key = value.getKey();
                // Not increment when COD amount = 0 and delivered
                if (key.equals("M3") && codAmount == 0) {
                    continue;
                }
                // Not increase when COD amount > 0 and not payed
                if (key.equals("M1") && codAmount > 0 && codTransferDate != null && codTransferDate.equals("")) {
                    continue;
                }
                // Just increase M4 when has deliver time
                if (key.equals("M4")) {
                    int counter = 0;
                    for (Log log : logs) {
                        if (log.getStatus().equals("delivering")) {
                            counter += 1;
                        }
                    }
                    if (counter < 1) {
                        continue;
                    }
                }
                // Not calculate M9 when have more than one time deliver
                if (key.equals("M9")) {
                    int _counter = 0;
                    for (Log log : logs) {
                        if (log.getStatus().equals("delivering")) {
                            _counter++;
                        }
                        if (log.getStatus().equals("delivered")) {
                            _counter = 0;
                        }
                    }
                    if (_counter > 0) {
                        break;
                    }
                }
                result.add(key);
            }
        }
        return result;
    }

    public static Integer[] calculateMetric(List<String> increasesMetric, List<String> decreaseMetric) {
        Integer[] result = new Integer[10];
        for (int i = 0; i < 10; i++) {
            if (result[i] == null) {
                result[i] = STABLE;
            }

            for (String metric : increasesMetric) {
                if (metric.equals("M" + i)) {
                    result[i] += INCREASE;
                    break;
                }
            }
            for (String metric : decreaseMetric) {
                // never decrease M0
                if (metric.equals("M" + i) && !metric.equals("M0")) {
                    result[i] += DECREASE;
                    break;
                }
            }
        }
        return result;
    }
}
