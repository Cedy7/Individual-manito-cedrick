package com.joysistvi.day3.variable;

public class Variable {
    public static void main(String[] args) {
        // initialize a variable
        byte age = 20;
        short num = 500;
        int num2 = 50_000;
        long num3 = 100000000l; //warning mean error in naming convention
        System.out.println(num3);
        //System.out.println(age);

        float average = 99.90f;
        double price = 10.5;
        //System.out.println(price);

        boolean is_active = false;
        is_active = true;

        System.out.print(is_active);

        char middleInitial= 'C';
        //System.out.println(middleInitial);

        String firstName = "Cedrick";
        String lastName = "Manito";

        System.out.print("FULL Name: " + lastName + ", " + firstName + " " + middleInitial + ".");   //concationation
        //Concatenation (+) -> joining strings
        // Full Name: Manito, Cedrick C.


    }
}
//concationation use '+' sign
// Syntax -> structure of code
// Main Method: psvm + tab
// Print Statement: sout + tab