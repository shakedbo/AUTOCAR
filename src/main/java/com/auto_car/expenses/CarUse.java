package com.auto_car.expenses;

public class CarUse implements Expense {
    private String licensePlate;

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String getLicensePlate() {
        return this.licensePlate;
    }
}
