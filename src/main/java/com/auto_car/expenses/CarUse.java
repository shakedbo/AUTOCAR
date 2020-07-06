package com.auto_car.expenses;

import java.util.Date;

public class CarUse extends ExpenseBase {

    protected CarUse(Date date) {
        super(date);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
