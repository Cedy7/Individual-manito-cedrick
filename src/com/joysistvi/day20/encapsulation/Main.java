package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen();
        Scanner scanner = new Scanner(System.in);


        System.out.println(" *** Ballpen Information Program *** ");
        System.out.println("Please enter the details below:\n");


        System.out.print("Enter brand: ");
        ballpen.setBrand(scanner.nextLine());

        System.out.print("Enter Color: ");
        ballpen.setColor(scanner.nextLine());

        System.out.print("Enter Point Size: ");
        ballpen.setPointSize(scanner.nextDouble());

        System.out.print("Enter Weight In Gramps: ");
        ballpen.setWeightInGramps(scanner.nextDouble());


        System.out.println("\n--- Ballpen Details ---");
        System.out.println("Brand: " + ballpen.getBrand());
        System.out.println(("color: " + ballpen.getColor()));
        System.out.println(("Point Size: " + ballpen.getPointSize()));
        System.out.println(("Weight In Gramps: " + ballpen.getWeightInGramps()));



        scanner.close();
    }
}
