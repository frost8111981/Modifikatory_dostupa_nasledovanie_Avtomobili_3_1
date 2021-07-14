package com.frost;

public class PICKUP extends VehicleTypeByBodyTypes{
    public PICKUP(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
