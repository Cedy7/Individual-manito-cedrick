package com.joysistvi.day4.operator;

public class Activity2_Manito {
    public static void main(String[] args) {

        //Initialization Of Variables
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        //println
        System.out.println(" * Expense Tracker Program * ");
        System.out.println("Income: " + (int) income);
        //printf
        System.out.printf("Food Allowance: %.1f %%%n", ((foodAllowance/income) * 100));
        System.out.printf("Transportation: %.1f %%%n", ((transportation/income) * 100));
        System.out.printf("Rent: %.1f %%%n", ((rent/income) * 100));
        System.out.printf("Utility Bill: %.1f %%%n", ((utilityBill/income) * 100));
        //total
        System.out.println("Remaining Balance: " + (int) (income - (foodAllowance + transportation + rent + utilityBill)));
    }
}
