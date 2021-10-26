package com.ghn;

import com.google.gson.annotations.SerializedName;

public class ShippingOrder {
    @SerializedName("old")
    private New old;
    @SerializedName("new")
    private New shippingOrderNew;


    public New getOld() {
        return old;
    }

    public void setOld(New value) {
        this.old = value;
    }


    public New getShippingOrderNew() {
        return shippingOrderNew;
    }

    public void setShippingOrderNew(New value) {
        this.shippingOrderNew = value;
    }
}


class New {
    @SerializedName("_id")
    private String id;
    @SerializedName("data")
    private Data data;


    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }


    public Data getData() {
        return data;
    }

    public void setData(Data value) {
        this.data = value;
    }
}

class Data {
    @SerializedName("shop_id")
    private Long shopID;
    @SerializedName("client_id")
    private Long clientID;
    @SerializedName("return_name")
    private String returnName;
    @SerializedName("return_phone")
    private String returnPhone;
    @SerializedName("return_address")
    private String returnAddress;
    @SerializedName("return_ward_code")
    private String returnWardCode;
    @SerializedName("return_district_id")
    private Long returnDistrictID;
    @SerializedName("return_location")
    private Location returnLocation;
    @SerializedName("from_name")
    private String fromName;
    @SerializedName("from_phone")
    private String fromPhone;
    @SerializedName("from_address")
    private String fromAddress;
    @SerializedName("from_ward_code")
    private String fromWardCode;
    @SerializedName("from_district_id")
    private Long fromDistrictID;
    @SerializedName("from_location")
    private Location fromLocation;
    @SerializedName("deliver_station_id")
    private Long deliverStationID;
    @SerializedName("to_name")
    private String toName;
    @SerializedName("to_phone")
    private String toPhone;
    @SerializedName("to_address")
    private String toAddress;
    @SerializedName("to_ward_code")
    private String toWardCode;
    @SerializedName("to_district_id")
    private Long toDistrictID;
    @SerializedName("to_location")
    private Location toLocation;
    @SerializedName("weight")
    private Long weight;
    @SerializedName("length")
    private Long length;
    @SerializedName("width")
    private Long width;
    @SerializedName("height")
    private Long height;
    @SerializedName("converted_weight")
    private Long convertedWeight;
    @SerializedName("service_type_id")
    private Long serviceTypeID;
    @SerializedName("service_id")
    private Long serviceID;
    @SerializedName("payment_type_id")
    private Long paymentTypeID;
    @SerializedName("payment_type_ids")
    private long[] paymentTypeIDS;
    @SerializedName("custom_service_fee")
    private Long customServiceFee;
    @SerializedName("cod_amount")
    private Long codAmount;
    @SerializedName("cod_collect_date")
    private Object codCollectDate;
    @SerializedName("cod_transfer_date")
    private String codTransferDate;
    @SerializedName("is_code_transferred")
    private boolean isCodTransferred;
    @SerializedName("is_cod_collected")
    private boolean isCodCollected;
    @SerializedName("insurance_value")
    private Long insuranceValue;
    @SerializedName("order_value")
    private Long orderValue;
    @SerializedName("pick_station_id")
    private Long pickStationID;
    @SerializedName("client_order_code")
    private String clientOrderCode;
    @SerializedName("require_note")
    private String requiredNote;
    @SerializedName("content")
    private String content;
    @SerializedName("note")
    private String note;
    @SerializedName("employee_note")
    private String employeeNote;
    @SerializedName("seal_code")
    private String sealCode;
    @SerializedName("pickup_time")
    private String pickupTime;
    @SerializedName("items")
    private Item[] items;
    @SerializedName("coupon")
    private String coupon;
    @SerializedName("_id")
    private String id;
    @SerializedName("order_code")
    private String orderCode;
    @SerializedName("version_no")
    private String versionNo;
    @SerializedName("updated_ip")
    private String updatedIP;
    @SerializedName("updated_employee")
    private Long updatedEmployee;
    @SerializedName("updated_client")
    private Long updatedClient;
    @SerializedName("updated_source")
    private String updatedSource;
    @SerializedName("updated_date")
    private String updatedDate;
    @SerializedName("updated_warehouse")
    private Long updatedWarehouse;
    @SerializedName("created_ip")
    private String createdIP;
    @SerializedName("created_employee")
    private Long createdEmployee;
    @SerializedName("created_client")
    private Long createdClient;
    @SerializedName("created_source")
    private String createdSource;
    @SerializedName("created_date")
    private String createdDate;
    @SerializedName("status")
    private String status;
    @SerializedName("pick_warehouse_id")
    private Long pickWarehouseID;
    @SerializedName("deliver_warehouse_id")
    private Long deliverWarehouseID;
    @SerializedName("current_warehouse_id")
    private Long currentWarehouseID;
    @SerializedName("return_warehouse_id")
    private Long returnWarehouseID;
    @SerializedName("next_warehouse_id")
    private Long nextWarehouseID;
    @SerializedName("leadtime")
    private String leadtime;
    @SerializedName("order_date")
    private String orderDate;
    @SerializedName("action")
    private String action;
    @SerializedName("soc_id")
    private String socID;
    @SerializedName("finish_date")
    private Object finishDate;
    @SerializedName("tag")
    private String[] tag;
    @SerializedName("log")
    private Log[] log;
    @SerializedName("warehouse_log")
    private WarehouseLog[] warehouseLog;
    @SerializedName("is_partial_return")
    private boolean isPartialReturn;
    @SerializedName("pick_shifh")
    private long[] pickShift;
    @SerializedName("updated_date_pick_shift")
    private String updatedDatePickShift;


    public Long getShopID() {
        return shopID;
    }

    public void setShopID(long value) {
        this.shopID = value;
    }


    public Long getClientID() {
        return clientID;
    }

    public void setClientID(long value) {
        this.clientID = value;
    }


    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String value) {
        this.returnName = value;
    }


    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String value) {
        this.returnPhone = value;
    }


    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String value) {
        this.returnAddress = value;
    }


    public String getReturnWardCode() {
        return returnWardCode;
    }

    public void setReturnWardCode(String value) {
        this.returnWardCode = value;
    }


    public Long getReturnDistrictID() {
        return returnDistrictID;
    }

    public void setReturnDistrictID(long value) {
        this.returnDistrictID = value;
    }


    public Location getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(Location value) {
        this.returnLocation = value;
    }


    public String getFromName() {
        return fromName;
    }

    public void setFromName(String value) {
        this.fromName = value;
    }


    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String value) {
        this.fromPhone = value;
    }


    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String value) {
        this.fromAddress = value;
    }


    public String getFromWardCode() {
        return fromWardCode;
    }

    public void setFromWardCode(String value) {
        this.fromWardCode = value;
    }


    public Long getFromDistrictID() {
        return fromDistrictID;
    }

    public void setFromDistrictID(long value) {
        this.fromDistrictID = value;
    }


    public Location getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Location value) {
        this.fromLocation = value;
    }


    public Long getDeliverStationID() {
        return deliverStationID;
    }

    public void setDeliverStationID(long value) {
        this.deliverStationID = value;
    }


    public String getToName() {
        return toName;
    }

    public void setToName(String value) {
        this.toName = value;
    }


    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String value) {
        this.toPhone = value;
    }


    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String value) {
        this.toAddress = value;
    }


    public String getToWardCode() {
        return toWardCode;
    }

    public void setToWardCode(String value) {
        this.toWardCode = value;
    }


    public Long getToDistrictID() {
        return toDistrictID;
    }

    public void setToDistrictID(long value) {
        this.toDistrictID = value;
    }


    public Location getToLocation() {
        return toLocation;
    }

    public void setToLocation(Location value) {
        this.toLocation = value;
    }


    public Long getWeight() {
        return weight;
    }

    public void setWeight(long value) {
        this.weight = value;
    }


    public Long getLength() {
        return length;
    }

    public void setLength(long value) {
        this.length = value;
    }


    public Long getWidth() {
        return width;
    }

    public void setWidth(long value) {
        this.width = value;
    }


    public Long getHeight() {
        return height;
    }

    public void setHeight(long value) {
        this.height = value;
    }


    public Long getConvertedWeight() {
        return convertedWeight;
    }

    public void setConvertedWeight(long value) {
        this.convertedWeight = value;
    }


    public Long getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(long value) {
        this.serviceTypeID = value;
    }


    public Long getServiceID() {
        return serviceID;
    }

    public void setServiceID(long value) {
        this.serviceID = value;
    }


    public Long getPaymentTypeID() {
        return paymentTypeID;
    }

    public void setPaymentTypeID(long value) {
        this.paymentTypeID = value;
    }


    public long[] getPaymentTypeIDS() {
        return paymentTypeIDS;
    }

    public void setPaymentTypeIDS(long[] value) {
        this.paymentTypeIDS = value;
    }


    public Long getCustomServiceFee() {
        return customServiceFee;
    }

    public void setCustomServiceFee(long value) {
        this.customServiceFee = value;
    }


    public Long getCodAmount() {
        return codAmount;
    }

    public void setCodAmount(long value) {
        this.codAmount = value;
    }


    public Object getCodCollectDate() {
        return codCollectDate;
    }

    public void setCodCollectDate(Object value) {
        this.codCollectDate = value;
    }


    public String getCodTransferDate() {
        return codTransferDate;
    }

    public void setCodTransferDate(String value) {
        this.codTransferDate = value;
    }


    public boolean getIsCodTransferred() {
        return isCodTransferred;
    }

    public void setIsCodTransferred(boolean value) {
        this.isCodTransferred = value;
    }


    public boolean getIsCodCollected() {
        return isCodCollected;
    }

    public void setIsCodCollected(boolean value) {
        this.isCodCollected = value;
    }


    public Long getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(long value) {
        this.insuranceValue = value;
    }


    public Long getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(long value) {
        this.orderValue = value;
    }


    public Long getPickStationID() {
        return pickStationID;
    }

    public void setPickStationID(long value) {
        this.pickStationID = value;
    }


    public String getClientOrderCode() {
        return clientOrderCode;
    }

    public void setClientOrderCode(String value) {
        this.clientOrderCode = value;
    }


    public String getRequiredNote() {
        return requiredNote;
    }

    public void setRequiredNote(String value) {
        this.requiredNote = value;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String value) {
        this.note = value;
    }


    public String getEmployeeNote() {
        return employeeNote;
    }

    public void setEmployeeNote(String value) {
        this.employeeNote = value;
    }


    public String getSealCode() {
        return sealCode;
    }

    public void setSealCode(String value) {
        this.sealCode = value;
    }


    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String value) {
        this.pickupTime = value;
    }


    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] value) {
        this.items = value;
    }


    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String value) {
        this.coupon = value;
    }


    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }


    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String value) {
        this.orderCode = value;
    }


    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String value) {
        this.versionNo = value;
    }


    public String getUpdatedIP() {
        return updatedIP;
    }

    public void setUpdatedIP(String value) {
        this.updatedIP = value;
    }


    public Long getUpdatedEmployee() {
        return updatedEmployee;
    }

    public void setUpdatedEmployee(long value) {
        this.updatedEmployee = value;
    }


    public Long getUpdatedClient() {
        return updatedClient;
    }

    public void setUpdatedClient(long value) {
        this.updatedClient = value;
    }


    public String getUpdatedSource() {
        return updatedSource;
    }

    public void setUpdatedSource(String value) {
        this.updatedSource = value;
    }


    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }


    public Long getUpdatedWarehouse() {
        return updatedWarehouse;
    }

    public void setUpdatedWarehouse(long value) {
        this.updatedWarehouse = value;
    }


    public String getCreatedIP() {
        return createdIP;
    }

    public void setCreatedIP(String value) {
        this.createdIP = value;
    }


    public Long getCreatedEmployee() {
        return createdEmployee;
    }

    public void setCreatedEmployee(long value) {
        this.createdEmployee = value;
    }


    public Long getCreatedClient() {
        return createdClient;
    }

    public void setCreatedClient(long value) {
        this.createdClient = value;
    }


    public String getCreatedSource() {
        return createdSource;
    }

    public void setCreatedSource(String value) {
        this.createdSource = value;
    }


    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String value) {
        this.createdDate = value;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }


    public Long getPickWarehouseID() {
        return pickWarehouseID;
    }

    public void setPickWarehouseID(long value) {
        this.pickWarehouseID = value;
    }


    public Long getDeliverWarehouseID() {
        return deliverWarehouseID;
    }

    public void setDeliverWarehouseID(long value) {
        this.deliverWarehouseID = value;
    }


    public Long getCurrentWarehouseID() {
        return currentWarehouseID;
    }

    public void setCurrentWarehouseID(long value) {
        this.currentWarehouseID = value;
    }


    public Long getReturnWarehouseID() {
        return returnWarehouseID;
    }

    public void setReturnWarehouseID(long value) {
        this.returnWarehouseID = value;
    }


    public Long getNextWarehouseID() {
        return nextWarehouseID;
    }

    public void setNextWarehouseID(long value) {
        this.nextWarehouseID = value;
    }


    public String getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(String value) {
        this.leadtime = value;
    }


    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String value) {
        this.orderDate = value;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String value) {
        this.action = value;
    }


    public String getSocID() {
        return socID;
    }

    public void setSocID(String value) {
        this.socID = value;
    }


    public Object getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Object value) {
        this.finishDate = value;
    }


    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] value) {
        this.tag = value;
    }


    public Log[] getLog() {
        return log;
    }

    public void setLog(Log[] value) {
        this.log = value;
    }


    public WarehouseLog[] getWarehouseLog() {
        return warehouseLog;
    }

    public void setWarehouseLog(WarehouseLog[] value) {
        this.warehouseLog = value;
    }


    public boolean getIsPartialReturn() {
        return isPartialReturn;
    }

    public void setIsPartialReturn(boolean value) {
        this.isPartialReturn = value;
    }


    public long[] getPickShift() {
        return pickShift;
    }

    public void setPickShift(long[] value) {
        this.pickShift = value;
    }


    public String getUpdatedDatePickShift() {
        return updatedDatePickShift;
    }

    public void setUpdatedDatePickShift(String value) {
        this.updatedDatePickShift = value;
    }
}

class Location {
    private double lat;
    private double locationLong;


    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }


    public double getLocationLong() {
        return locationLong;
    }

    public void setLocationLong(double value) {
        this.locationLong = value;
    }
}

class Item {
    private String name;
    private String code;
    private Long quantity;
    private Long price;
    private Long length;
    private Long width;
    private Long height;
    private Category category;


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }


    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(long value) {
        this.quantity = value;
    }


    public Long getPrice() {
        return price;
    }

    public void setPrice(long value) {
        this.price = value;
    }


    public Long getLength() {
        return length;
    }

    public void setLength(long value) {
        this.length = value;
    }


    public Long getWidth() {
        return width;
    }

    public void setWidth(long value) {
        this.width = value;
    }


    public Long getHeight() {
        return height;
    }

    public void setHeight(long value) {
        this.height = value;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category value) {
        this.category = value;
    }
}


class Category {
    private String level1;
    private String level2;
    private String level3;


    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String value) {
        this.level1 = value;
    }


    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String value) {
        this.level2 = value;
    }


    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String value) {
        this.level3 = value;
    }
}

class Log {
    @SerializedName("status")
    private String status;
    @SerializedName("payment_type_id")
    private Long paymentTypeID;
    @SerializedName("updated_date")
    private String updatedDate;


    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }


    public Long getPaymentTypeID() {
        return paymentTypeID;
    }

    public void setPaymentTypeID(long value) {
        this.paymentTypeID = value;
    }


    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }
}

class WarehouseLog {
    @SerializedName("current_warehouse_id")
    private Long currentWarehouseID;
    @SerializedName("pick_warehouse_id")
    private Long pickWarehouseID;
    @SerializedName("deliver_warehouse_id")
    private Long deliverWarehouseID;
    @SerializedName("return_warehouse_id")
    private Long returnWarehouseID;
    @SerializedName("updated_date")
    private String updatedDate;


    public Long getCurrentWarehouseID() {
        return currentWarehouseID;
    }

    public void setCurrentWarehouseID(long value) {
        this.currentWarehouseID = value;
    }


    public Long getPickWarehouseID() {
        return pickWarehouseID;
    }

    public void setPickWarehouseID(long value) {
        this.pickWarehouseID = value;
    }


    public Long getDeliverWarehouseID() {
        return deliverWarehouseID;
    }

    public void setDeliverWarehouseID(long value) {
        this.deliverWarehouseID = value;
    }


    public Long getReturnWarehouseID() {
        return returnWarehouseID;
    }

    public void setReturnWarehouseID(long value) {
        this.returnWarehouseID = value;
    }


    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }
}
