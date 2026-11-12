package com.joysistvi.day24.Activity17_Manito;

public class Main {
    public static void main(String[] args) {
        /*
        Code: Pen pen = new Pen("generic", "Blue", 15);
        error: 'Pen' is abstract; cannot be instantiated
        Explanation: an abstract class is just a blueprint,
        meaning, it not an object and cannot be used like object for instantiation.
         */

        Ballpen ballpen = new Ballpen("Pilot", "Black", 15, 0.5);
        Pencil pencil = new Pencil("Faber", "Black", 10, "3H");

        System.out.print("\n=== testPen() ===");
        testPen(ballpen);
        testPen(pencil);

        System.out.print("\n=== testRefillable() ===");
        testRefillable(ballpen);
        testRefillable(pencil);

        System.out.println("\n=== testClickable() ===");
        testClickable(ballpen);

        /*
        Code: testClickable(pencil);
        Error: incompatible types: com.joysistvi.day24.Activity17_Manito.Pencil cannot be converted to com.joysistvi.day24.Activity17_Manito.Clickable
        Explanation:  my child class namely Pencil didn't implement the Clickable interface
        that's why when I use the testClicable method to my clild class, it cause an error when
        the program runs the method body that will direct to clickable interface.
        */
    }

    public static void testPen(Pen pen) {
        System.out.println("\n" + pen); // to remove: \n
        pen.write();
        pen.store();
//        pen.refill();
    }

    public static void testRefillable(Refillable refillable) {
        System.out.println();
        refillable.refill();
        System.out.println(Refillable.MAX_REFILLS);

    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
        System.out.print(" The ballpen Tip comes out.");
    }

    /* Difference of Abstract class (extends) and Interface (implements)
    Abstract class can only support single inheritance, while Interface can multiple implementation.
    all variable in Interface is defaultly declared as public static final while in abstract class can
    still have an instance variables.
     */
}
