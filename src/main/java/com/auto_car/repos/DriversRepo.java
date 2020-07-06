package com.auto_car.repos;

import drivers.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriversRepo {

    private DriversRepo(){}
    private volatile static DriversRepo instance;
    private static final Object lock = new Object();

    public static DriversRepo getInstance(){
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new DriversRepo();
                }
            }
        }
        return instance;
    }


    private final List<Driver> drivers = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void addDriver(Driver driver) {
        for (Driver current : this.drivers) {
            if (driver.getId().equals(current.getId())) {
                return;
            }
        }

        this.drivers.add(driver);
    }

    public void removeDriver(String driverIdToRemove) {
        for (Driver current : this.drivers) {
            if (driverIdToRemove.equals(current.getId())) {
                this.drivers.remove(current);
                break;
            }
        }
    }

    public Driver getDriverById(String driverId) {
        for (Driver driver : this.drivers) {
            if (driver.getId().equals(driverId)) {
                return driver;
            }
        }
        return null;
    }
}
