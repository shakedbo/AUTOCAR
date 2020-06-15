package com.auto_car.model;

public class TruckCar extends Vehicle {
    @Override
    public LicenseType getLicenceType() {
        return LicenseType.C;
    }
}
