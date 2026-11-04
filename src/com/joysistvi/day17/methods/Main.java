package com.joysistvi.day17.methods;

public class Main {

    public static void main(String[] args) {

        Scope obj = new Scope(); //instance method
        obj.a();

        System.out.println(obj.age); // instance variable




        Scope.greet(); // static method

        System.out.println(Scope.name); // static variable




    }

}
