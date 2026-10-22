package com.joysistvi.day9.looping.forloop;

import java.util.Scanner;

public class ExperimentalCode {
    public static void main(String[] args) {
        System.out.print("Processing files: ");

        for (int i = 0; i <= 100; i += 5) {
        // \r moves the cursor back to the start of the line,
        // overwriting the previous percentage text
        System.out.print("\rProcessing files: " + i + "% ");

            try {
            // Pause for 150 milliseconds so you can see the animation
            Thread.sleep(150);
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
        }

        // Print a final newline once done so the next terminal prompt is clean
        System.out.println("\nComplete!");
    }
}
