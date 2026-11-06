package com.joysistvi.day21.encap;

import  java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        System.out.println("*** Ballpen Information Program ***");
        System.out.println("Please enter the details below:\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter point size: ");
        double pointSize = scanner.nextDouble();
        System.out.print("Enter weight in grams: ");
        double weightInGrams = scanner.nextDouble();

        Ballpen ballpen = new Ballpen(brand, color, pointSize, weightInGrams);


        System.out.println("\n=== Ballpen Details ===");
        System.out.println(ballpen);






    }
}


/*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Enter point size: ");
        double pointSize = scanner.nextDouble();
        System.out.println("Enter weight in grams");
        double weightInGramps = scanner.nextDouble();


        Ballpen ballpen = new Ballpen("Panda", "Blue", 0.5, 30);

        System.out.println(ballpen);

        Ballpen ballpen2 = new Ballpen("Pilot", "Black", 1, 20);

//        Ballpen ballpen3





//        ballpen.brand = "Philflex";
//        ballpen.color = "Red";
//        ballpen.ballSize = 0.7f;
//        ballpen.inkType = "Oil-Based";
//
//        ballpen.write();
//        ballpen.labeling();
//        ballpen.stab();
//
//        Ballpen ballpen2 = new Ballpen();
//        ballpen2.brand = "iPen4";
//        ballpen.color = "Blue";
//        ballpen.ballSize = 1.0f;
//        ballpen2.inkType = "Oil-Based";
//
//        ballpen2.write();
//        ballpen2.labeling();
//        ballpen2.stab();

 */