package com.auto_car.model;

import java.awt.*;
import java.util.Date;

public abstract class Vehicle {
    private String licensePlate;
    private Date dateOfTest;
    private VehicleExpenses vehicleExpenses;
    private Color color;
    private int mileage;
    private String manufacture;  //carModel
    private Date onRoadDate;  //YearCar

    public abstract LicenseType getLicenceType();


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Date getDateOfTest() {
        return dateOfTest;
    }

    public void setDateOfTest(Date dateOfTest) {
        this.dateOfTest = dateOfTest;
    }

    public VehicleExpenses getVehicleExpenses() {
        return vehicleExpenses;
    }

    public void setVehicleExpenses(VehicleExpenses vehicleExpenses) {
        vehicleExpenses = vehicleExpenses;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Date getOnRoadDate() {
        return onRoadDate;
    }

    public void setOnRoadDate(Date onRoadDate) {
        this.onRoadDate = onRoadDate;
    }
}
