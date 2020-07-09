package com.auto_car.expenses;

import com.auto_car.model.Vehicle;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class GarageVisit extends ExpenseBase {
    private int price;
    private String mechanicChanges;
    private Date recommendVisitDate(Vehicle vehicle)
    {
        Date todayDate = new Date();

        if(vehicle.getOnRoadDate().getMonth() == todayDate.getMonth())
        {
            System.out.println("Go to Garage");
        }
        return todayDate;
    };

    protected GarageVisit(Date date) {
        super(date);
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public String getMechanicChanges() {
        return mechanicChanges;
    }

    public void setMechanicChanges(String mechanicChanges) {
        this.mechanicChanges = mechanicChanges;
    }
}
