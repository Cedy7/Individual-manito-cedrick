package com.joysistvi.day21.activity14;

import java.util.Scanner;

public class Activity14_Manito {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String message1 = """
                ***********************************
                *    User Account Registration    *
                ***********************************
                """;

        System.out.println(message1);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        String email = emailMethod();
        String password = passwordMethod();

        UserAccount account = new UserAccount(firstName, middleName, lastName, address, email, password);

        System.out.println();
        System.out.println(account);
    }

    public static String emailMethod() {
        while (true) {
            System.out.print("Enter Email: ");
            String email = scanner.nextLine().toLowerCase();
            boolean validation = email.contains("@");

            if (validation) {
                return email;
            } else {
                System.out.println("Invalid Input: used valid email with @ in it");
            }
        }
    }


    public static String passwordMethod() {
        while (true) {
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (password == null) {
                password = "";
            }

            boolean isValid = true;

            if (password.length() < 8) {
                System.out.println("Missing: Minimum length of 8 characters");
                isValid = false;
            }
            if (!password.matches(".*[a-z].*")) {
                System.out.println("Missing: Lowercase letter");
                isValid = false;
            }
            if (!password.matches(".*[A-Z].*")) {
                System.out.println("Missing: Uppercase letter");
                isValid = false;
            }
            if (!password.matches(".*\\d.*")) {
                System.out.println("Missing: Number");
                isValid = false;
            }
            if (!password.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("Missing: Special character");
                isValid = false;
            }

            if (isValid) {
                return password;
            }

            System.out.println("Password is invalid because of those missing requirements!\nPlease try again.\n");
        }
    }
}



/*
//        UserAccount account = new UserAccount();

//
//        System.out.print("Enter First Name: ");
//        account.setFirstName(scanner.nextLine());
//
//
//        System.out.print("Enter Middle Name: ");
//        account.setMiddleName(scanner.nextLine());
//
//        System.out.print("Enter Last Name: ");
//        account.setLastName(scanner.nextLine());
//
//        System.out.print("Enter Address: ");
//        account.setAddress(scanner.nextLine());

//
//        account.setEmail(emailMethod());
//
//        account.setPassword(passwordMethod());


//        System.out.println("\n--- User Account Created ---");
//        System.out.println("Full Name: " + account.getFirstName() + " " + account.getMiddleName() + " " + account.getLastName());
//        System.out.println("Address: " + account.getAddress());
//        System.out.println("Email: " + account.getEmail());


 */