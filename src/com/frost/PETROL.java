package com.frost;

public class PETROL extends VehicleTypeByFuelTypes{


    public PETROL(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
