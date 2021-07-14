package com.frost;

public class TRUCK extends VehicleTypeByPurpose{
    public TRUCK(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
