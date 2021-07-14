package com.frost;

public class Main {

    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PASSENGER("Степка"),
                new SEDAN("BMV"), new PETROL("95"));
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TRUCK("Урал"),
                new PICKUP("WV"), new DIESEL("DIS"));

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PASSENGER("Дима"));

        adsService.filterByVehicleTypeByPurpose(new TRUCK("Билаз"));





        // write your code here
    }
}
