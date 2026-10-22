package com.joysistvi.day7;

import java.util.Scanner;

public class Activity5_Manito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        =====================================================================
        LEVEL 1: USSD Code Entry (*143#)
        Note: this part of the code is where the user will dial *143#
        and if the user didn't put the right data type, it will trow an error
        =====================================================================
         */
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dialCode = input.nextLine();
        System.out.println();

        // this code will throw an error if user didn't follow the instruction
        while (!dialCode.equals("*143#")) {
            System.out.println("Wrong USSD Code, Try again!");
            System.out.println("Dial *143# to access Globe Services");
            System.out.println("Enter 0 if you want to Exit");
            System.out.print("Enter USSD Code: ");
            dialCode = input.nextLine();
            System.out.println();
            if (dialCode.equals("0")) {
                System.out.println("Program End");
                return;
            }
        }

        /*
        ========================================================
        LEVEL 2: Main Menu (Load Registration)
        Note: this part is where user choose what Load Promo
        to avail.
        ========================================================
        */
        System.out.println("* Load Registration *");
        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoEXTRA");
        System.out.println("[4] UNLI 5G");
        System.out.println("[5] ALLNET");
        System.out.print("Enter a choice: ");
        int userInput = input.nextInt();
        System.out.println();

        // this code will throw an error if user didn't follow the instruction
        while (userInput < 1 || userInput > 5) {
            System.out.println("Wrong input number, try again!");
            System.out.println("Enter number (1-5) only! ");
            System.out.println("Enter 0 if you want to Exit!");
            System.out.println();
            System.out.println("* Load Registration *");
            System.out.println("[1] Go+");
            System.out.println("[2] Go");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] UNLI 5G");
            System.out.println("[5] ALLNET");
            System.out.print("Enter a choice: ");
            userInput = input.nextInt();
            System.out.println();
            if (userInput == 0) {
                System.out.println("Program End");
                return;
            }
        }


        /*
        ======================================================================================
        LEVEL 3: Category Selection (Switch Menu)
        Note: this part is where the program will choose in Lambda Syntax Switch statements
        on what will appear in screen based on what the user had type in terminal or keyword.
        ======================================================================================
         */
        switch (userInput) {

            /*
            -------------------------------------------------------------------------------
            Option 1: Go+ Promos
            -------------------------------------------------------------------------------
            */
            case 1 -> {
                System.out.println("*** Go+ Promos ***");
                System.out.println("[1] Go+99");
                System.out.println("[2] Go+129");
                System.out.println("[3] Go+149");
                System.out.print("Enter a choice: ");
                userInput = input.nextInt();
                System.out.println();

                // this code will throw an error if user didn't follow the instruction
                while (userInput < 1 || userInput > 3) {
                    System.out.println("Wrong input number, try again!");
                    System.out.println("Enter number (1-3) only! ");
                    System.out.println("Enter 0 if you want to Exit!");
                    System.out.println();
                    System.out.println("*** Go+ Promos ***");
                    System.out.println("[1] Go+99");
                    System.out.println("[2] Go+129");
                    System.out.println("[3] Go+149");
                    System.out.print("Enter a choice: ");
                    userInput = input.nextInt();

                    // Final execution block
                    if (userInput == 0) {
                        System.out.println("Program End");
                        return;
                    }
                }

                /*
                ==============================================
                LEVEL 4: Specific Promo Action & Confirmation
                Note: if user choose a Go+ Promo
                ==============================================
                */
                switch (userInput) {

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                     Option 1: Go+99
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 1 -> {
                        System.out.println("*** Go+99 Promo ***");
                        System.out.println("-> Get 8 GB all-access data + 8 GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning of error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go+99 Promo ***");
                            System.out.println("-> Get 8 GB all-access data + 8 GB");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go+99 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 2: Go+129
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 2 -> {
                        System.out.println("*** Go+129 Promo ***");
                        System.out.println("-> Get 10 GB all-access data + 10 GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go+129 Promo ***");
                            System.out.println("-> Get 10 GB all-access data + 10 GB");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go+129 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 3: Go+149
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 3 -> {
                        System.out.println("*** Go+149 Promo ***");
                        System.out.println("-> Get 12 GB all-access data + 12 GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go+149 Promo ***");
                            System.out.println("-> Get 12 GB all-access data + 12 GB");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go+149 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                }
            }


            /*
            -------------------------------------------------------------------------------
            Option 2: Go Promos
            -------------------------------------------------------------------------------
            */
            case 2 -> {
                System.out.println("*** Go Promos ***");
                System.out.println("[1] Go50");
                System.out.println("[2] Go90");
                System.out.println("[3] Go120");
                System.out.print("Enter a choice: ");
                userInput = input.nextInt();
                System.out.println();

                // this code will throw an error if user didn't follow the instruction
                while (userInput < 1 || userInput > 3) {
                    System.out.println("Wrong input number, try again!");
                    System.out.println("Enter number (1-3) only! ");
                    System.out.println("Enter 0 if you want to Exit!");
                    System.out.println();
                    System.out.println("*** Go Promos ***");
                    System.out.println("[1] Go50");
                    System.out.println("[2] Go90");
                    System.out.println("[3] Go120");
                    System.out.print("Enter a choice: ");
                    userInput = input.nextInt();

                    // Final execution block
                    if (userInput == 0) {
                        System.out.println("Program End");
                        return;
                    }
                }

                /*
                ==============================================
                LEVEL 4: Specific Promo Action & Confirmation
                Note: if user choose a Go Promo
                ==============================================
                */
                switch (userInput) {

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 1: Go50
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 1 -> {
                        System.out.println("*** Go50 Promo ***");
                        System.out.println("-> Get 2 GB all-access data + unli all net texts.");
                        System.out.println("-> Valid for 3 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go50 Promo ***");
                            System.out.println("-> Get 2 GB all-access data + unli all net texts.");
                            System.out.println("-> Valid for 3 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go50 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 2: Go90
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 2 -> {
                        System.out.println("*** Go90 Promo ***");
                        System.out.println("-> Get 8 GB all-access data + unli all net texts.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go90 Promo ***");
                            System.out.println("-> Get 8 GB all-access data + unli all net texts.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go90 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 3: Go120
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 3 -> {
                        System.out.println("*** Go120 Promo ***");
                        System.out.println("-> Get 10 GB all-access data + unli all net texts.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** Go120 Promo ***");
                            System.out.println("-> Get 10 GB all-access data + unli all net texts.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to Go120 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                }
            }


            /*
            -------------------------------------------------------------------------------
            Option 3: GoEXTRA Promos
            -------------------------------------------------------------------------------
            */
            case 3 -> {
                System.out.println("*** GoEXTRA Promos ***");
                System.out.println("[1] GoEXTRA99");
                System.out.println("[2] GoEXTRA129");
                System.out.println("[3] GoEXTRA149");
                System.out.print("Enter a choice: ");
                userInput = input.nextInt();
                System.out.println();

                // this code will throw an error if user didn't follow the instruction
                while (userInput < 1 || userInput > 3) {
                    System.out.println("Wrong input number, try again!");
                    System.out.println("Enter number (1-3) only! ");
                    System.out.println("Enter 0 if you want to Exit!");
                    System.out.println();
                    System.out.println("*** GoEXTRA Promos ***");
                    System.out.println("[1] GoEXTRA99");
                    System.out.println("[2] GoEXTRA129");
                    System.out.println("[3] GoEXTRA149");
                    System.out.print("Enter a choice: ");
                    userInput = input.nextInt();

                    // Final execution block
                    if (userInput == 0) {
                        System.out.println("Program End");
                        return;
                    }
                }

                /*
                ==============================================
                LEVEL 4: Specific Promo Action & Confirmation
                Note: if user choose a GoEXTRA Promo
                ==============================================
                */
                switch (userInput) {

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 1: GoEXTRA99
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 1 -> {
                        System.out.println("*** GoEXTRA99 Promo ***");
                        System.out.println("-> Get 8 GB all-access data + unli all net calls and texts.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** GoEXTRA99 Promo ***");
                            System.out.println("-> Get 8 GB all-access data + unli all net calls and texts.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to GoEXTRA99 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 2: GoEXTRA129
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 2 -> {
                        System.out.println("*** GoEXTRA129 Promo ***");
                        System.out.println("-> Get 10 GB all-access data + unli all net calls and texts.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** GoEXTRA129 Promo ***");
                            System.out.println("-> Get 10 GB all-access data + unli all net calls and texts.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to GoEXTRA129 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }


                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 3: GoEXTRA149
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 3 -> {
                        System.out.println("*** GoEXTRA149 Promo ***");
                        System.out.println("-> Get 15 GB all-access data + unli all net calls and texts.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** GoEXTRA149 Promo ***");
                            System.out.println("-> Get 15 GB all-access data + unli all net calls and texts.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to GoEXTRA149 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                }
            }

            /*
            -------------------------------------------------------------------------------
            Option 4: UNLI 5G Promos
            -------------------------------------------------------------------------------
            */
            case 4 -> {
                System.out.println("*** UNLI 5G Promos ***");
                System.out.println("[1] UNLI 5G 99");
                System.out.println("[2] UNLI 5G 149");
                System.out.println("[3] UNLI 5G 199");
                System.out.print("Enter a choice: ");
                userInput = input.nextInt();
                System.out.println();

                // this code will throw an error if user didn't follow the instruction
                while (userInput < 1 || userInput > 3) {
                    System.out.println("Wrong input number, try again!");
                    System.out.println("Enter number (1-3) only! ");
                    System.out.println("Enter 0 if you want to Exit!");
                    System.out.println();
                    System.out.println("*** UNLI 5G Promos ***");
                    System.out.println("[1] UNLI 5G 99");
                    System.out.println("[2] UNLI 5G 149");
                    System.out.println("[3] UNLI 5G 199");
                    System.out.print("Enter a choice: ");
                    userInput = input.nextInt();

                    // Final execution block
                    if (userInput == 0) {
                        System.out.println("Program End");
                        return;
                    }
                }

                /*
                ==============================================
                LEVEL 4: Specific Promo Action & Confirmation
                Note: if user choose a UNLI 5G Promo
                ==============================================
                */
                switch (userInput) {

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 1: UNLI 5G 99
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 1 -> {
                        System.out.println("*** UNLI 5G 99 Promo ***");
                        System.out.println("-> Get unlimited 5G data (5G phone and area needed).");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** UNLI 5G 99 Promo ***");
                            System.out.println("-> Get unlimited 5G data (5G phone and area needed).");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to UNLI 5G 99 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 2: UNLI 5G 149
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 2 -> {
                        System.out.println("*** UNLI 5G 149 Promo ***");
                        System.out.println("-> Get unlimited 5G data + unli all net texts.");
                        System.out.println("-> Valid for 15 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** UNLI 5G 149 Promo ***");
                            System.out.println("-> Get unlimited 5G data + unli all net texts.");
                            System.out.println("-> Valid for 15 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to UNLI 5G 149 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 3: UNLI 5G 199
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 3 -> {
                        System.out.println("*** UNLI 5G 199 Promo ***");
                        System.out.println("-> Get unlimited 5G data + unli all net calls and texts.");
                        System.out.println("-> Valid for 30 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** UNLI 5G 199 Promo ***");
                            System.out.println("-> Get unlimited 5G data + unli all net calls and texts.");
                            System.out.println("-> Valid for 30 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to UNLI 5G 199 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                }
            }


            /*
            -------------------------------------------------------------------------------
            Option 5: ALLNET Promos
            -------------------------------------------------------------------------------
            */
            case 5 -> {
                System.out.println("*** ALLNET Promos ***");
                System.out.println("[1] ALLNET99");
                System.out.println("[2] ALLNET149");
                System.out.println("[3] ALLNET199");
                System.out.print("Enter a choice: ");
                userInput = input.nextInt();
                System.out.println();

                // this code will throw an error if user didn't follow the instruction
                while (userInput < 1 || userInput > 3) {
                    System.out.println("Wrong input number, try again!");
                    System.out.println("Enter number (1-3) only! ");
                    System.out.println("Enter 0 if you want to Exit!");
                    System.out.println();
                    System.out.println("*** ALLNET Promos ***");
                    System.out.println("[1] ALLNET99");
                    System.out.println("[2] ALLNET149");
                    System.out.println("[3] ALLNET199");
                    System.out.print("Enter a choice: ");
                    userInput = input.nextInt();

                    // Final execution block
                    if (userInput == 0) {
                        System.out.println("Program End");
                        return;
                    }
                }

                /*
                ==============================================
                LEVEL 4: Specific Promo Action & Confirmation
                Note: if user choose a ALLNET Promo
                ==============================================
                */
                switch (userInput) {

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 1: ALLNET99
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 1 -> {
                        System.out.println("*** ALLNET99 Promo ***");
                        System.out.println("-> Get unli all net texts + calls to all networks.");
                        System.out.println("-> Valid for 7 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** ALLNET99 Promo ***");
                            System.out.println("-> Get unli all net texts + calls to all networks.");
                            System.out.println("-> Valid for 7 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to ALLNET99 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    Option 2: ALLNET149
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 2 -> {
                        System.out.println("*** ALLNET149 Promo ***");
                        System.out.println("-> Get unli all net texts + calls to all networks + data.");
                        System.out.println("-> Valid for 15 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** ALLNET149 Promo ***");
                            System.out.println("-> Get unli all net texts + calls to all networks + data.");
                            System.out.println("-> Valid for 15 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to ALLNET149 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }

                    /*
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Option 3: ALLNET199
                    *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    */
                    case 3 -> {
                        System.out.println("*** ALLNET199 Promo ***");
                        System.out.println("-> Get unli all net texts + calls to all networks + more data.");
                        System.out.println("-> Valid for 30 days.");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter a choice:");
                        userInput = input.nextInt();
                        System.out.println();

                        // the warning or error if user didn't follow the instruction
                        while (userInput < 1 || userInput > 2) {
                            System.out.println("Wrong input number, try again!");
                            System.out.println("Enter number 1 and 2 only! ");
                            System.out.println();
                            System.out.println("*** ALLNET199 Promo ***");
                            System.out.println("-> Get unli all net texts + calls to all networks + more data.");
                            System.out.println("-> Valid for 30 days.");
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice:");
                            userInput = input.nextInt();
                            System.out.println();
                        }

                        // Final execution block
                        if (userInput == 1) {
                            System.out.println("You are now subscribed to ALLNET199 Promo!");
                        } else {
                            System.out.println("Program End");
                        }
                    }
                }
            }
        }
    }
}