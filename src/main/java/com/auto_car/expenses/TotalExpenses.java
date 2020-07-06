package com.auto_car.expenses;

import java.util.ArrayList;
import java.util.List;

public class TotalExpenses{

    private TotalExpenses(){}
    private volatile static TotalExpenses instance;
    private static final Object lock = new Object();

    public static TotalExpenses getInstance(){
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new TotalExpenses();
                }
            }
        }
        return instance;
    }

    private final List<Expense> expenseList = new ArrayList<>();

    public double getTotalExpenses(){
        double result = 0;
        for (Expense expense : expenseList) {
            result += expense.calculatePrice();
        }
        return result;
    }

    public double getTotalExpensesByLicensePlate(String licensePlate){
        double result = 0;
        for (Expense expense : expenseList) {
            if(licensePlate.equals(expense.getLicensePlate())){
                result += expense.calculatePrice();
            }
        }
        return result;
    }

    public void addExpense(Expense expense){
        if(expense != null){
            this.expenseList.add(expense);
        }
    }
}
