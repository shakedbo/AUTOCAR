package com.auto_car.model;

import java.awt.*;
import java.util.Date;

public abstract class Vehicle {
    private String carID;
    private Date dateOfTest;
    private TotalExpenses totalExpenses;
    private Color color;
    private int maileage;
    private String manufacture;  //carModel
    private Date onRoadDate;  //YearCar

    public abstract LicenseType getLicenceType();


    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Date getDateOfTest() {
        return dateOfTest;
    }

    public void setDateOfTest(Date dateOfTest) {
        this.dateOfTest = dateOfTest;
    }

    public TotalExpenses getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(TotalExpenses totalExpenses) {
        totalExpenses = totalExpenses;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaileage() {
        return maileage;
    }

    public void setMaileage(int maileage) {
        this.maileage = maileage;
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
