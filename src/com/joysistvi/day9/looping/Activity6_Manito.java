package com.joysistvi.day9.looping;

import java.util.Scanner;

public class Activity6_Manito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message = """
                Enter the multiplication \
                table you want to display: \
                """;

        System.out.print(message);
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {

                int product = number * i;
                System.out.println(number + " x " + i + " = " + product);
        }

    }
}
