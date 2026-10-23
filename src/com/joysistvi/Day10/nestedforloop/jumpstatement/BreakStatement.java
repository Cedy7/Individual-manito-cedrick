package com.joysistvi.Day10.nestedforloop.jumpstatement;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                continue;
            }

            System.out.print(i + "Hello");
        }
    }
}
