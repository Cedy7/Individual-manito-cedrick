package com.joysistvi.day5.RelationalOperator;

public class TernaryOperator {
    public static void main(String[] args) {



        //if (condition) {
        //} else {
        //}

        // Syntax
        // (Condition) ? true block : false block;

        //int age = 10;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        int num = 10;
        int num2 = 20;

        //int bigger = (num > num2) ? num : num2;
        //System.out.println("Bigger number: " + bigger);

        boolean isEvenNumber = num % 2 == 0;

        String result = (isEvenNumber) ? "Even Number" : "Odd Number";
        System.out.println("Number is " + result);
    }
}
