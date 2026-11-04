package com.joysistvi.day17.methods;

public class ReturnKeywordExample {

    public static void main(String[] args) {
        String fullname = createFullName("Cedy", "Ced");
        System.out.println("Full Name: " + fullname);
        System.out.println(createGreeting("Maria"));

    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "! Welcome to Java";
    }

    public static String createFullName(String firstName, String lastname) {
        return firstName + " " + lastname;
    }

}
