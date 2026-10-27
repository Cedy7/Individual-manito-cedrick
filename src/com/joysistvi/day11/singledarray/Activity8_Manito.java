package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8_Manito {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for (int numeric : num) {
            sum += numeric;
        }
        float average = sum/num.length;
        int highestNum = num[0];
        int lowestNum = num[0];
        for (int numerical : num) {
            if (highestNum < numerical) {
                highestNum =  numerical;
            }
            if (lowestNum > numerical) {
                lowestNum = numerical;
            }
        }

        System.out.println("\nIndex 1: " + num[0]);
        System.out.println("Index 2: " + num[1]);
        System.out.println("Index 3: " + num[2]);
        System.out.println("Index 4: " + num[3]);
        System.out.println("Index 5: " + num[4]);
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("\nMy Stretch Goal:");
        System.out.println("Highest Number = " + highestNum);
        System.out.println("Lowest Number = " + lowestNum);
    }
}