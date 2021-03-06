package com.auto_car.model;

import com.auto_car.repos.UserBuilder;
import com.auto_car.repos.VehicleRepo;

public class User {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;
    private String fistName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String password;

    public static UserBuilder builder(){
        return builder();
    }


    public void addVehicle(Vehicle vehicle) {
        VehicleRepo.getInstance().addVehicle(vehicle);
    }

    public void RemoveVehicle(Vehicle vehicle) {
        VehicleRepo.getInstance().removeVehicle(vehicle.getLicensePlate());
    }
}
