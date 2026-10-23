package com.joysistvi.Day10.nestedforloop;

public class Activity7_Manito {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            System.out.println("\nMultiplication Table of " + j);
            for (int i = 1; i <= 10; i++) {

                int product = j * i;
                System.out.println(j + " x " + i + " = " + product);
            }
        }
    }
}
