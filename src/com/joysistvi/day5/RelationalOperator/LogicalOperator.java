package com.joysistvi.day5.RelationalOperator;

public class LogicalOperator {
    public static void main(String [] arg) {
        //Compound Conditional Statement

        int age = 16;
        //13 - 17
        boolean isJuniorHigh = (age >= 13) && (age < 17);
        boolean isAdult = !(age < 18);

        System.out.println(isJuniorHigh);

        //faster
        //check only the first and proceed to next line not next work
        //boolean isJuniorHigh = (age >= 13) && (age < 17);
        //slower
        // check both even if first is enought
        //boolean isJuniorHigh = (age >= 13) & (age < 17);

        //System.out.println(isValidAge);

        //int num = 10;
        //int num2 = 20;

        //                       T            F
        //System.out.println(num < num2 && num > num2);
        //                      F            T
        //System.out.println(num > num2 || num < num2);


    }
}
