package com.ghn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.util.Collector;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
@PublicEvolving
public class ShippingOrderSchema implements DeserializationSchema<ShippingOrder>, SerializationSchema<ShippingOrder> {

    @Override
    public ShippingOrder deserialize(byte[] bytes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
//        ShippingOrder so;
        try {
            ShippingOrder so = gson.fromJson(new String(bytes, StandardCharsets.UTF_8), ShippingOrder.class);
                    return so;
        } catch (Exception e) {
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
            throw e;
        }
    }

    @Override
    public boolean isEndOfStream(ShippingOrder shippingOrder) {
        return false;
    }

    @Override
    public byte[] serialize(ShippingOrder shippingOrder) {
        return new byte[0];
    }

    @Override
    public TypeInformation<ShippingOrder> getProducedType() {
        return null;
    }
}
