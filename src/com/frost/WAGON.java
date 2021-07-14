package com.frost;

public class WAGON extends VehicleTypeByPurpose{
    public WAGON(String attribute) {
        super(attribute);
    }
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
