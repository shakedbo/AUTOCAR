package com.auto_car.expenses;

import java.util.Date;

public class GarageVisit extends ExpenseBase {
    private int price;

    protected GarageVisit(Date date) {
        super(date);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
