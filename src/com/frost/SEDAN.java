package com.frost;

public class SEDAN extends VehicleTypeByBodyTypes{
    public SEDAN(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
