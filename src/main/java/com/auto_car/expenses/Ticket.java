package com.auto_car.expenses;

import java.util.Date;

public class Ticket extends ExpenseBase {

    private Date date;
    private final double fee;

    public Ticket(Date date,double fee){
        super(date);
        this.fee = fee;
    }

    @Override
    public double calculatePrice() {
        return this.fee;
    }
}
