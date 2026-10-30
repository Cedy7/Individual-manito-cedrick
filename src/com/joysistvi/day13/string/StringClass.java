package com.joysistvi.day13.string;

import com.sun.jdi.StringReference;

import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {

        // Login Program

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Login ***");

        String username = " ";
        String password = " ";

        for (int attempt = 0; attempt < 5; attempt++) {
            String correctUsername = "admin";
            String correctPassword = "admin123";

            System.out.print("Enter Username: ");
            username = scanner.nextLine();

            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            // Validation
            if (username.isEmpty() && password.isEmpty()) {
                System.out.println("Username and Password cannot be empty");
            }

            // Authentication
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("login successfully!");
                System.out.println("Welcome, " + username + "!");
                break;
            } else {
                System.out.println("Invalid Username or Password.");
                System.out.println("Access Denied.\n");
            }


        }

    }
}

// System.out.println(word.middle.initial(4));


/*
// Exit
        System.out.println("Are you sure that you really wanna exit?");
        System.out.println("Type Y to proceed");
        System.out.println("Type N to cancel");

        System.out.println("\nEnter your choice; ");
String choice = String.valueOf(scanner.nextLine().charAt(0));


        if (choice.equals("Y")) {
        System.out.println("Exiting ... ");
        } else {
                System.out.println("Returning Back to Main Menu");
        }

*/
