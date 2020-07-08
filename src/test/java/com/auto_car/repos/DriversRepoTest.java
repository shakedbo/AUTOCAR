package com.auto_car.repos;


import com.auto_car.model.Driver;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

class DriversRepoTest {

    DriversRepo driversRepo = DriversRepo.getInstance();

    @BeforeEach
    void setUp() {
        Driver driver = new Driver();
        driver.setId("1234");

        Driver driver1 = new Driver();
        driver1.setId("12345");

        driversRepo.addDriver(driver);
        driversRepo.addDriver(driver1);
    }

    @org.junit.jupiter.api.Test
    void getDrivers() {
        List<Driver> drivers = driversRepo.getDrivers();
        assert drivers.size() == 2;
    }

    @org.junit.jupiter.api.Test
    void removeDriver() {
        driversRepo.removeDriver("1234");
        assert driversRepo.getDrivers().size() == 1 ;

        driversRepo.removeDriver("1111");
        assert driversRepo.getDrivers().size() == 1 ;
    }

    @org.junit.jupiter.api.Test
    void addDriver() {
    }



    @org.junit.jupiter.api.Test
    void getDriverById() {
    }


}

