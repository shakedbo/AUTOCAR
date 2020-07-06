package com.auto_car.model;

import com.auto_car.expenses.Expense;

import java.util.ArrayList;
import java.util.List;

public class VehicleExpenses {

    private final List<Expense> expenseList = new ArrayList<>();
    private final String licensePlate;

    public VehicleExpenses(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTotalExpenses(){
        double result = 0;
        for (Expense expense : expenseList) {
            result += expense.calculatePrice();
        }
        return result;
    }

    public void addExpense(Expense expense){
        if(expense != null){
            this.expenseList.add(expense);
        }
    }
}
