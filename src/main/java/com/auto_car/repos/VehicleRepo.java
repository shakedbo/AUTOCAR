package com.auto_car.repos;

import com.auto_car.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleRepo {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        for (Vehicle current : this.vehicles) {
            if (vehicle.getCarID().equals(current.getCarID())) {
                return;
            }
        }

        this.vehicles.add(vehicle);
    }

    public void removeVehicle(String carIdToRemove){
        for (Vehicle current : this.vehicles) {
            if (carIdToRemove.equals(current.getCarID())) {
                this.vehicles.remove(current);
                break;
            }
        }
    }

    public Vehicle getVehicleById(String carId){
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getCarID().equals(carId)) {
                return vehicle;
            }
        }
        return null;
    }


}
