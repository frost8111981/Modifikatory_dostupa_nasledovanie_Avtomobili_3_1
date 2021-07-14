package com.frost;

public class DIESEL extends VehicleTypeByFuelTypes{
    public DIESEL(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
