package com.frost;

public class HYBRID extends VehicleTypeByFuelTypes{
    public HYBRID(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
