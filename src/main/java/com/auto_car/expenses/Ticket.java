package com.auto_car.expenses;

import java.util.Date;

public class Ticket extends ExpenseBase {

    private Date date;

    public Ticket(Date date){
        super(date);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public Date getDate() {
        return this.date;
    }
}
