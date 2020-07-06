package com.auto_car.expenses;

import java.util.Date;

public abstract class ExpenseBase implements Expense {

    private final Date date;

    protected ExpenseBase(Date date){
        this.date = date;
    }

    @Override
    public Date getDate() {
        return this.date;
    }
}
