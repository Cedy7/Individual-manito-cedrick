package com.joysistvi.day12.multidarray;

import java.util.Scanner;

    public class Activity9_Manito {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String title = """
                \n========================================
                           Average Calculator           
                ========================================
                """;

            System.out.println(title);

            System.out.print("Enter number of students: ");
            int studentNumber = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int subjectNumber = sc.nextInt();
            sc.nextLine();

            String[] subject = new String[subjectNumber];

            System.out.println("Enter subject names:");
            for (int data = 0; data < subjectNumber; data++) {
                System.out.print("Subject " + (data + 1) + ": ");
                subject[data] = sc.nextLine();
            }

            String[] studentNames = new String[studentNumber];
            double[][] grades = new double[studentNumber][subjectNumber];
            double[] averages = new double[studentNumber];

            for (int row = 0; row < studentNumber; row++) {
                System.out.println();
                System.out.print("Name of Student " + (row + 1) + ": ");
                studentNames[row] = sc.nextLine();

                System.out.println("Enter grades for each subject:");
                double sum = 0;
                for (int column = 0; column < subjectNumber; column++) {
                    System.out.print(subject[column] + ": ");
                    grades[row][column] = sc.nextDouble();
                    sum += grades[row][column];
                }
                sc.nextLine();

                averages[row] = sum / subjectNumber;
            }

            String gradeReport = """
                    \n========================================
                                  Grades Report              
                    ========================================
                    """;

            System.out.println(gradeReport);

            System.out.printf("%-22s", "Student");
            for (String sub : subject) {
                System.out.printf("%-9s", sub);
            }
            System.out.printf("%-8s%n", "Average");

            System.out.println("------------------------------------------------------------------");
            for (int row = 0; row < studentNumber; row++) {
                System.out.printf("%-22s", studentNames[row]);
                for (int column = 0; column < subjectNumber; column++) {
                    System.out.printf("%-9d", (int) grades[row][column]);
                }
                System.out.printf("%-8.2f%n", averages[row]);
            }

            sc.close();
        }
    }

