package com.joysistvi.day6.ifstatement;

public class Activity4_Manito {
    public static void main (String [] args) {

        int age = 25;
        String category = "";

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        if (age >= 0 && age <=2) {
            category = "Baby";
        } else if (age >= 3 && age <=12) {
            category = "Child";
        } else if (age >= 13 && age <=19) {
            category = "Teenager";
        } else if (age >= 20 && age <=29) {
            category = "Young Adult";
        } else if (age >= 30 && age <=59) {
            category = "Adult";
        } else {
            category = "Senior";
        }

        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
    }
}
