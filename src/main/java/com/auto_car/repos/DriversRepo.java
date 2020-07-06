package com.auto_car.repos;
import com.auto_car.model.Vehicle;
import drivers.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverRepo {

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

    public void removeVehicle(String driverIdToRemove) {
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
