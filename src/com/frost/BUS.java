package com.frost;

public class BUS extends VehicleTypeByPurpose{
    public BUS(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
