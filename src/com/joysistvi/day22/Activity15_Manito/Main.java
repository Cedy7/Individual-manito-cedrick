package com.joysistvi.day22.Activity15_Manito;

public class Main {
    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Pilot", "Black", 15, 0.5);
        Pencil pencil = new Pencil("Faber", "Black", 10, "3H");

        System.out.println(ballpen);
        ballpen.write();
        System.out.println("\n" + pencil);
        pencil.write();

    }
}
