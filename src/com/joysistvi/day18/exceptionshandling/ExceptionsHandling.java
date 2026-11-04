package com.joysistvi.day18.exceptionshandling;

import java.util.Scanner;

public class ExceptionsHandling {

    public static void main(String [] args) {
        // ArrayIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);


        try {

            String input = sc.nextLine();
            double choice = Double.parseDouble(input);
            System.out.println(choice);

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
    }
}
/*

            int[] numbers = {1, 2, 3, 4, 5};

//            System.out.println(numbers[6]);

 */