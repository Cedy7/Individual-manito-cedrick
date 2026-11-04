package com.joysistvi.day16.methods;

public class JavaMethod {

    public static void main(String[] args) {

        int year = 2027;
        if (year == 2026) {
            greet("Cedy", 25);
        } else if (year ==2027) {
            greet ("CC", 26);
        }

    }


    // void - does not return anything
    public static void greet(String name, int age) {

        //String name = "Winter";

        // no "return"  here because void is used.
        printMoto("Hello, my name is " + name);
        printMoto("I am " + age + " years old.");
    }

    public static void printMoto(String word) {
        System.out.println(word);
    }
}

/*

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        // int data = sum(1,2);
    }

    public static int sum(int a, int b) { //if there is static, you don't have to create an object
        return a + b;
        /* return - is used to exit the method
         now, return is something that will return anything next to it. */

   // }

//*/





// pascal- class\ snake - database\ camel case - variable
// naming convention - no to noun, always verb or actions for method naming convention
//  method signature is method name and parameter list
// non parametirazied - no parameter
// parameter list - parameter