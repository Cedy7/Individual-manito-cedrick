
/*
//CN means Control Note
//-it is where the explanation in reporting will be conducted where you choose dipperent approach
// or something about your code is differently done
*/


/*
documentations:
CN: 001
*Problem With Break And Return Inside Exit Method
-exit method cannot be used because using break statement or return statement will not terminate the program itself,
those two command will only terminate the loop or methods, which will return to the programming going back to where it came from
like in this code, the previous method or the main method itself.
*Absolutely Not system.exit()
-using system.exit can help my code right now but not ideal if I will use it in websites so I choose not to used that
so that in the future, I can used my code if I ever need use it in website or android app where SQL is connected.

CN: 002
-still in progress

CN: 003
-I implement that code so that if "loc: 001" is reach, the program will go back to "loc: 002" where everything started in the first place.
if I didn't do that, user can exit the dial code process and will just proceed to main menu even thought user still have not finished or
enter the correct dial code in dialUssdCode() method.

*/


/*requirement:
// dapat mag stop ang program pag nag exit or nag stop si user


my additional requirements:
//create a message variable wheere all message will be stored

//check if user can go back to where he should be is if he type wrong choice.

// check if every error message to user is professional and does makes sense and not ambiguous

// implement dual new line in every new message

// add try and catch exception handling especially to those line that used scanner


*/


/*
Warnings:
// be carefull of using scanner like this "mainChoice = scanner.nextInt();",
// so, check every use of scanner, maybe those scanner should not be there since you have to use getInput() method
*/

package com.joysistvi.day16.methods;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode();
        System.out.println("String thing level 1");

    }

    public static void dialUssdCode() {

        while (true) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.println("Enter 0 if you want to Exit");
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine().trim();

            // 1. Success condition
            if (ussdCode.equals("*143#")) {
                break; // Exits the loop and moves on to the main menu
            }

            // 2. Exit condition
            if (ussdCode.equals("0")) {
                boolean exitVerified = exitMethod();
                if (exitVerified) {
                    return; // Exits the entire method / program
                } else {
                    continue; // Loops back to top automatically
                }
            }

            // 3. Catch-all for anything else (Invalid code)
            System.out.println("\nInvalid USSD Code, Try again!\n");
        }

        // Now reachable!
        promptMainMenu();

        System.out.println("strange thing level 2!");

    }
//        boolean userWillContinue = true; //cn: 003
//
//        while (userWillContinue == true) { //cn: 003
//            System.out.println("Dial *143# to access Globe Services"); //loc: 002
//            System.out.print("Enter USSD Code: ");
//            String ussdCode = scanner.nextLine();
//
////
//            if (ussdCode.equals("*143#")) {
//                userWillContinue = false;
//                System.out.println("you reach it!");
////
//           }
//
//            //(!dialCode.equals("*143#"))
//            // guard clause / early exit
//            // this code will throw an error if user didn't follow the instruction
//            while (!ussdCode.equals("*143#")) {
//                System.out.println("\n\nInvalid USSD Code, Try again!");
//                System.out.println("Dial *143# to access Globe Services");
//                System.out.println("Enter 0 if you want to Exit");
//                System.out.print("Enter USSD Code: ");
//                ussdCode = scanner.nextLine();
//                System.out.println();
//
//
//
//                if (ussdCode.equals("*143#")) {
//                    userWillContinue = false;
//                    System.out.println("you reach it!");
////
//                }
//                // CN: 002 - processing
//                // Program terminator
//                if (ussdCode.equals("0")) {

    /// /                System.out.println("Program End");
    /// /                return;
//                    boolean exitVerified = exitMethod();
//                    if (exitVerified == true) {
//                        return;
//
//                    } else {
//                        userWillContinue = true; //CN: 003
//                        break; //CN: 001 // loc: 001
//                    }
//                }
//            }
//        }
//        if (!ussdCode.equals("*143#")) {
//            System.out.println("Invalid USSD Code!");
//            return;
//        }

//        promptMainMenu();
    public static void promptMainMenu() {


        while (true) {
            System.out.println("\n\n        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");
            int mainChoice = getInput("Enter a choice: ");
//            if (mainChoice == 0) {
//                System.out.println("Program End");
//                return;
//            }


            // put continue somewhere here
            if (mainChoice == 0) {
//                System.out.println("Program End");
//                return;
                boolean exitVerified = exitMethod();
                if (exitVerified == true) {
//                    boolean goingBack = true
                    return;
                } else {
                    continue;
                }
            }


            while (mainChoice < 1 || mainChoice > 5) {
                System.out.println("\n\nInvalid input number, try again!");
                System.out.println("Enter number (1-5) only! ");
                break;
            }


//            // this code will throw an error if user type numbers outside 1 - 5
//            while (mainChoice < 1 || mainChoice > 5) {
//                System.out.println("\n\nInvalid input number, try again!");
//                System.out.println("Enter number (1-5) only! ");
//                System.out.println();
//                System.out.println("* Load Registration *");
//                System.out.println("[1] Go+");
//                System.out.println("[2] Go");
//                System.out.println("[3] GoEXTRA");
//                System.out.println("[4] UNLI 5G");
//                System.out.println("[5] ALLNET");
//                System.out.println("Enter 0 if you want to Exit!");
//                mainChoice = getInput("Enter a choice: ");
//                System.out.println();
//                if (mainChoice == 0) {
//                    System.out.println("Program End");
//                    return;
//                }
//            }


            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
//            case 3 -> goExtraPromo();
//            case 4 -> unli5GPromo();
//            case 5 -> allNetPromo();
                case 0 -> exitMethod(); //useless and shall be remove or condired now
            }
            System.out.println("strange thing level 3");
        }


    }

    public static void goPlusPromo() {
        System.out.println("        *** Go+ Promos ***");
        System.out.println("    [1] Go+99");
        System.out.println("    [2] Go+129");
        System.out.println("    [3] Go+149");
        System.out.println("    [4] Back");
        System.out.println("    [0] Exit");
        System.out.println("    [9] go back");
        int goPlusChoice = getInput("Enter a choice: ");


        if (goPlusChoice == 0) {
            boolean exitVerified = exitMethod();
            if (exitVerified == true) {//?? what will heppen if this code is run
//                    boolean goingBack = true
                return;//?? what will heppen if this code is run
            } else {
//                continue;
            }
        } else if (goPlusChoice == 9) { //?? what will heppen if this code is run
            return;//?? what will heppen if this code is run

        }


        while (goPlusChoice < 1 || goPlusChoice > 5) {
            System.out.println("\n\nInvalid input number, try again!");
            System.out.println("Enter number (1-5) only! ");
            break;
        }


        switch (goPlusChoice) {
            case 1 -> promoDetailsMenu("Go+", 8, 8);
            case 2 -> promoDetailsMenu("Go+129", 16, 16);
            case 3 -> promoDetailsMenu("Go+149", 32, 32);
//            case 9 -> {
//                return;

        }


    }


    public static void goPromo() {
        System.out.println();
        System.out.println("        *** Go Promos ***");
        System.out.println("    [1] Go50");
        System.out.println("    [2] Go90");
        System.out.println("    [3] Go120");
        System.out.println("    [0] Exit");
        System.out.print("Enter a choice: ");
        int goChoice = scanner.nextInt();

        switch (goChoice) {
            case 1 -> promoDetailsMenu("Go50", 5, 3);
            case 2 -> promoDetailsMenu("Go90", 8, 5);
            case 3 -> promoDetailsMenu("Go120", 12, 8);
            case 4 -> exitMethod();

        }
    }

    public static void promoDetailsMenu(String promoName, int gb, int freeGB) {
        System.out.println();
        System.out.println("        *** " + promoName + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");
        System.out.print("Enter a choice: ");
        int actionChoice = scanner.nextInt();
    }

    public static boolean exitMethod() {
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your choice: ");
        String choice = String.valueOf(scanner.nextLine().trim().charAt(0));

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
            return true; //testing
        } else { //should add N to e specific
            System.out.println("Returning Back\n");
            return false; //testing
        } //should add another conditional statement to make the program trow error message if input is neither Y nor N
    }

    // method for exception handling if user type letter instead of numbers
// & this method will turn the string input to int input
    public static int getInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            try {
                // will use the class not primitive data type below
                return Integer.parseInt(input); //parseInt - will turn string into integer

            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter numbers only");
            }
        }
    }
}