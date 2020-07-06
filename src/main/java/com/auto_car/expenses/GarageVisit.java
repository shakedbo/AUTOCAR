package com.auto_car.expenses;

public class GarageVisit implements Expense {
    private int price;

    @Override
    public double calculatePrice() {
        return price;
    }

}
