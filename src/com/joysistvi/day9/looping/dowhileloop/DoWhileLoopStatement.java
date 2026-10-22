package com.joysistvi.day9.looping.dowhileloop;

import java.util.Scanner;

public class DoWhileLoopStatement {

    public static void main(String[] agrs) {
//
//        String color = "Black";
//        while (color == "White") {
//            System.out.println(color);
//        }
//
//        do {
//            System.out.println("Black");
//        } while(color == "White");
//




        Scanner scanner = new Scanner(System.in);
        // Flag variable / boolean flag
        boolean isRunning = true;

//
//         escape sequences
//         \n = new line
//         \t = tab

        do {
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


        } while (isRunning);
    }
}
