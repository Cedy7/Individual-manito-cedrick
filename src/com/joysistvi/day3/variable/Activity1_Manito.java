package com.joysistvi.day3.variable;

public class Activity1_Manito {
    public static void main(String[] args) {

        //Initialization of Variables
        char middleInitial = 'C';
        String firstName = "Cedrick";
        String lastName = "Manito";
        short currentYear = 2026;

        //Sleep Stuff
        boolean hasGoodSleep = false;
        byte numOfSleep = 6;

        //Motivation Stuff
        int motivationLevel = -1000000;
        long motivationRequiredToday = 1000000000000L;

        //Home Details
        float noiseAroundInDecibel = 35.0f;
        double roomTemp = 25.555555d;

        System.out.println("Name: " + lastName + ", " + firstName + " " + middleInitial + ". ");
        System.out.println("This code is written in the year of: " + currentYear);
        System.out.println();
        System.out.println("Sleep Status");
        System.out.println("Number of Sleep Tonight: " + numOfSleep );
        System.out.println("Has good Sleep?: " + hasGoodSleep);
        System.out.println();
        System.out.println("Motivation for Today");
        System.out.println("Motivation right now: " + motivationLevel);
        System.out.println("Required Motivation for Today: " + motivationRequiredToday);
        System.out.println();
        System.out.println("Home Status");
        System.out.println("Noise Around the room: " + noiseAroundInDecibel + " Decibel");
        System.out.println("Room Temperature: " + roomTemp + " Degrees Celsius");
    }
}
