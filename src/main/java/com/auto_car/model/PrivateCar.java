package com.auto_car.model;

public class  PrivateCar extends Vehicle {
    @Override
    public LicenseType getLicenceType() {
        return LicenseType.B;
    }

}
