package com.frost;

public class ELECTRIC extends VehicleTypeByFuelTypes{
    public ELECTRIC(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
