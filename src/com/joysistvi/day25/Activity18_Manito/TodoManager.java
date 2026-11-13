package com.joysistvi.day25.Activity18_Manito;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String menu = """
                1. Add a task
                2. View all tasks
                3. Update a task
                4. Remove a task
                5. Clear all tasks
                0. Exit
                """;
        System.out.println("--- To-do Manager Menu ---");
        System.out.print(menu);
        int numberReceived = getInput("Enter your choice:");

        int mainChoice = getInput(numberReceived);
        switch (mainChoice) {
            case 1 -> addTask();
            case 2 -> viewTasks();
            case 3 -> updateTask();
            case 4 -> removeTask();
            case 5 -> clearTasks();
            case 0 -> exitMethod();
        }
    }

    public static void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Successfully entered the " + task + " task!\n");
        showMenu();
    }

    public static void viewTasks() {
        System.out.println("\nHere is all existing tasks in your To-do List:\n" + tasks + "\n");
        showMenu();
    }

    public static void updateTask() {
        while (true) {
            System.out.print("\nWhat is the name of task you wanna update?");
            String taskToUpdate = scanner.nextLine();
            if (tasks.contains(taskToUpdate)) {
                System.out.print("what do you wanna put instead?");
                String replacement = scanner.nextLine();
                int index = tasks.indexOf(taskToUpdate);
                tasks.set(index, replacement);
                System.out.println("\nSuccessfully update the task!\n");
                break;
            } else if (taskToUpdate.equals("0")) {
                System.out.println();
                showMenu();
            } else {
                System.out.println("\nNo " + taskToUpdate + " task is found inside you Todo-List!");
                System.out.println("Try again or enter 0 if you want to go back to main menu.\n");
            }
        }
        showMenu();
    }

    public static void removeTask() {
        while (true) {
            System.out.print("\nWhat is the name of task you wanna remove?");
            String taskToRemove = scanner.nextLine();
            if (tasks.contains(taskToRemove)) {
                tasks.remove(taskToRemove);
                System.out.println("Successfully removed the task!");
                break;
            } else if (taskToRemove.equals("0")) {
                System.out.println();
                showMenu();
            } else {
                System.out.println("\nNo " + taskToRemove + " task is found inside you Todo-List!");
                System.out.println("Try again or enter 0 if you want to go back to main menu.\n");
            }
        }
        showMenu();
    }

    public static void clearTasks() {
        tasks.clear();
        System.out.println("\nAll of elements inside the task is successfully removed!\n");
        showMenu();
    }

    // The only place where the program really ends (when the user answers Y)
    public static void exitMethod() {
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("    [Y] Yes - Exit Program");
        System.out.println("    [N] No - Go Back");

        while (true) {
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting TodoManager. Goodbye!");
                scanner.close();
                System.exit(0);
            } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                System.out.println();
                showMenu();
            }

            System.out.println("Invalid Input. Please enter Y or N.");
        }
    }

    // Keeps asking until the user enters a valid integer
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid Input. Please enter a number.");
            }
        }
    }

    public static int getInput(int number) {
        while (number < 0 || number > 5) {
            System.out.print("\nInvalid task number!\nOnly accept 1-5 or number 0");
            System.out.print("\nEnter your choice:");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid numeric digit.");
            }
        }
        return number;
    }
}
