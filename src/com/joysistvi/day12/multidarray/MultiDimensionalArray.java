package com.joysistvi.day12.multidarray;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] numbers = {
               //0  1  2
                {1, 2, 3, 4, 5}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9},// 2
                {0}
        };
        //                      [row][column]
        //System.out.println(numbers[1][0]);

        //System.out.println(numbers.length);

        System.out.println("Traversing a multi-dimensional array using nested for loop");
        // Traversing a multi-dimensional array using nested for loop
        for (int rows = 0; rows < numbers.length; rows++) {
            for (int column = 0; column < numbers[rows].length; column++) {
                System.out.println(numbers[rows][column]);
            }
            System.out.println();
        }

        System.out.println("\nTraversing a multi-dimensional array using nested for-each loop");
        // Traversing a multi-dimensional array using nested for-each loop
        for (int[] rows : numbers) {
            for (int column : rows) {
                System.out.println(column);
            }
            System.out.println();
        }


    }
}
