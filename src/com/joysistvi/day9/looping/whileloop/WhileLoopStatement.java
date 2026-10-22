package com.joysistvi.day9.looping.whileloop;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        // Flag variable / boolean flag
        boolean isRunning = true;

        // escape sequences
        // \n = new line
        // \t = tab

        while (isRunning) {
            System.out.println("* Load Reg *");
            System.out.println("[1]");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[0]");
            System.out.print("Enter you choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("you are now subscribed to Text Only\n");
                    isRunning = false;
                }
                case 2 -> System.out.println("you are now subscribed to Call Only\n");
                case 3 -> System.out.println("you are now subscribed to Call N Text Only\n");
                case 0 -> {
                    System.out.println("Exit...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Input!\n");
            }

        }


    }
}

/*

 //This program display even numbers from 1 to 5;
        // 5 loops
        int number = 1;
        //       1  <=  5
        while (number <= 5) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;

 */



/*
 int lives = 3;

        while (lives > 0) {
            System.out.println("Game is running");
            lives--;
        }

        // windows + .
        System.out.println("Game is over 😊");
*/