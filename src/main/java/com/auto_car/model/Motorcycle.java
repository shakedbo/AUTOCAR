package com.auto_car.model;

public class Motorcycle extends Vehicle {
    @Override
    public LicenseType getLicenceType() {
        return LicenseType.A;
    }
}
