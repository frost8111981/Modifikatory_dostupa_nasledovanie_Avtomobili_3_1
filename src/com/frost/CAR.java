package com.frost;

public class CAR extends VehicleTypeByPurpose{
    public CAR(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
