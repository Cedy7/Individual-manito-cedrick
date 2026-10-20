package com.joysistvi.day6.ifstatement;

public class IfElseStatement {
    public static void main(String [] args) {
        // Program that identifies if age is Valid or Invalid
        int age = 17;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        String result = "";
        if (age >= 18) {
            // executes when age is 18 or older
            result = "Valid Age";
        } else {
            result = "Invalid Age";
        }

        System.out.println(age + " is " + result);
    }
}
