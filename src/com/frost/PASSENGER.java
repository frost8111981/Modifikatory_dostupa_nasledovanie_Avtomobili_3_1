package com.frost;

public class PASSENGER extends VehicleTypeByPurpose{
    public PASSENGER(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
