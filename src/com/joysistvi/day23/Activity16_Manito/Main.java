package com.joysistvi.day23.Activity16_Manito;

public class Main {
    public static void main(String[] args) {

        Pen pen = new Pen("generic", "Blue", 15);
        Pen ballpen = new Ballpen("Pilot", "Black", 15, 0.5);
        Pen pencil = new Pencil("Faber", "Black", 10, "3H");

        System.out.println("--- Pen ---");
        pen.write();
        pen.refill();

        System.out.println("\n--- Ballpen ---");
        ballpen.write();
        ballpen.refill();

        System.out.println("\n--- Pencil ---");
        pencil.write();
        pencil.refill();

        System.out.print("\n=== testPen() ===");
        testPen(pen);
        testPen(ballpen);
        testPen(pencil);

        System.out.print("\n=== Overloading ===\n");
        pen.write("Hello");
        pen.write("Hello", 3);
    }

    public static void testPen(Pen pen) {
        System.out.println("\n" + pen);
        pen.write();
        pen.refill();
    }

    // Difference of Method Overloading(Compile-Time) and Method Overriding(Runtime)
    /* Method Overloading is when the program will choose what method to implement
    depending on what data type of the arguments were inside the parameter of the
    method being used while the Method Overriding use the keyword @Override to change
    the content of the method that the child class inherit from parent class,
    without manually changing the name nor creating another method for specific task,
    which in turn prevent the violation of Don't Repeat Yourself or (DRY) Principle.
    In Method Overloading, the decision is decided by a program before it run,
    while in Method Overriding, the program will decide while it is running.

     */
}
