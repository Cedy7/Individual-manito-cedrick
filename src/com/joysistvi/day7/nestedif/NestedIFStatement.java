package com.joysistvi.day7.nestedif;

public class NestedIFStatement {
    public static void main (String [] args) {

        int age = 3;
        String category = "";
        String subCategory = "";

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        if (age >= 0 && age <=2) {
            category = "Baby";
            if (age <= 1 && age >= 0) {
                subCategory = "Infant";
            }
            if (age == 2) {
                subCategory = "Toddler";
            }
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
            if (age <= 75) {
                // 60 - 75 -> Young-old senior
                subCategory = "Young-old Senior";
            } else {
                //79 - 100 -> old Senior
                subCategory = "Old Senior";

            }

        }

        //System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println("Subcategory: " + subCategory);
    }
}



//if (subCategory != null) {
//    System.out.println("Subcategory: " + subCategory);