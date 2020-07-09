package com.auto_car.repos;

import com.auto_car.expenses.Ticket;
import com.auto_car.model.PrivateCar;
import com.auto_car.model.Vehicle;
import com.auto_car.model.VehicleExpenses;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleRepo {

    private VehicleRepo(){
        Vehicle vehicle = new PrivateCar();
        vehicle.setLicensePlate("125-48-354");

        VehicleExpenses vehicleExpenses = new VehicleExpenses(vehicle.getLicensePlate());
        vehicleExpenses.addExpense(new Ticket(new Date(2020,1,1),100));
        vehicleExpenses.addExpense(new Ticket(new Date(2020,1,2),2000));
        vehicle.setVehicleExpenses(vehicleExpenses);

        addVehicle(vehicle);
    }
    private volatile static VehicleRepo instance;
    private static final Object lock = new Object();
    public static VehicleRepo getInstance(){
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new VehicleRepo();
                }
            }
        }
        return instance;
    }

    private final List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        for (Vehicle current : this.vehicles) {
            if (vehicle.getLicensePlate().equals(current.getLicensePlate())) {
                return;
            }
        }

        this.vehicles.add(vehicle);
    }

    public void removeVehicle(String licensePlateToRemove){
        for (Vehicle current : this.vehicles) {
            if (licensePlateToRemove.equals(current.getLicensePlate())) {
                this.vehicles.remove(current);
                break;
            }
        }
    }

    public Vehicle getVehicleById(String carId){
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getLicensePlate().equals(carId)) {
                return vehicle;
            }
        }
        return null;
    }


}
