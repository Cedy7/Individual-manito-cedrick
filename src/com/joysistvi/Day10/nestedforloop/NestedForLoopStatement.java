package com.joysistvi.Day10.nestedforloop;

public class NestedForLoopStatement {

    public static void main(String[] args) {
        for (int i = 10 ; i >= 1; i--) {

            //System.out.println("*");
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}




        // syntax of nested for loop
        // The inner loop executes completely whenever outer loop executes.
        //
//        for (int i = 1 ; i < 5; i++) {
//            System.out.println(i);
//            for (int j = 1; j <= i; j++) {
//                System.out.println("\t" + j);
//            }
//        }
//
//        for (int i = 1 ; i <= 5; i++) {
//
//            System.out.println("*");
//            for (int j = 1;j <= i; j++) {
//
//                int control = 1;
//                System.out.print("*");
//                control++;
//                if (control == 3) {
//                    return;
//                }
//            }
//
////            for (int _ = 1; j <= 5; j++) {
////                if (i < j) {
////                    System.out.println("*");
////                }
////                //System.out.println("*");
////            }
//        }

        /*
            *
            * *
            * * *
         */




/*
//syntax of nested for loop

        for (int i = 1; i <= 10 ; i++) { // outer loop

            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) { // inner loop
                System.out.println(i + " * " + j + " = " + (i * j));

            }
            System.out.println();

        }
 */