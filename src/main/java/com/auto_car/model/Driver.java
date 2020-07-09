package com.auto_car.model;

import java.util.Date;

public class Driver
{

    private String firstName;
    private String lastName;
    private String id;
    private int licenseNumber;
    private LicenseType licenseType;
    private Date licenseExpiredDate;
    private int drivingExperience;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Date getLicenseExpiredDate() {
        return licenseExpiredDate;
    }

    public void setLicenseExpiredDate(Date licenseExpiredDate) {
        this.licenseExpiredDate = licenseExpiredDate;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
