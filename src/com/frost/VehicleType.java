package com.frost;

public class VehicleType {
    protected String attribute;

    VehicleType(String attribute){
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Some vehicle type name";
    }

}
