package com.joysistvi.day14.math;

public class Activity11_Manito {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        // Math.abs()
        x = -5.35;
        z = Math.abs(x);
        System.out.println("The absolute value of x is: " + z);

        // Math.max();
        x = 10;
        y = 30;
        z = Math.max(x, y);
        System.out.println("the maximun number is: " + z);

        // Math.min();
        x = 10;
        y = 30;
        z = Math.min(x, y);
        System.out.println("the maximun number is: " + z);

        // Math.pow();
        x = 4;
        y = 3;
        z = Math.pow(x, y);
        System.out.println("the power of x is: " + z);
        //   4 x 4  x 4  x 4
        //       8 = 16 = 64


        // Math.sqrt();
        x = 25;
        z = Math.sqrt(x);
        System.out.println("the square root of x is: " + z);

        // Math.round();
        x = 3.500;
        z = Math.round(x);
        System.out.println("the round of x is: " + z);

        //  Math.round();
        y = 3.499;
        z = Math.round(y);
        System.out.println("the round of y is: " + z);

        // Math.ceil();
        x = 3.950;
        z = Math.ceil(x);
        System.out.println("the ceiling of x is: " + z);

        // Math.ceil();
        y = 3.199;
        z = Math.ceil(y);
        System.out.println("the ceiling of y is: " + z);

        // Math.floor();
        x = 3.950;
        z = Math.floor(x);
        System.out.println("the floor of x is: " + z);

        // Math.floor();
        y = 3.199;
        z = Math.floor(y);
        System.out.println("the floor of y is: " + z);


        // Math.random();
        double f;
        f = Math.random();
        System.out.println("random number generated is: " + f);
        //note: the random object doesn't accept variable with data type of int,
        //float, and other more. it only accept double as data type.

        // Math.log();
        x = 4.000;
        z = Math.log(x);
        System.out.println("the natural logarithm of x  is: " + z);

        // Math.log10()
        x = 100.000;
        z = Math.log10(x);
        System.out.println("the base 10 logarithm of x is: " + z);

        // Math.exp()
        x = 1.000;
        z = Math.exp(x);
        System.out.println("the Euler's number raised to the power of x is: " + z);

        // Math.sin()
        double degrees = 90.0;
        double radians = Math.toRadians(degrees);
        double sineResult = Math.sin(radians);
        System.out.println("the radians of 90 degrees is: " + radians);
        System.out.println("the sine of 90 degrees is: " + sineResult);

        // Math.cos()
        degrees = 90.000;
        radians = Math.toRadians(degrees);
        double cosine = Math.cos(radians);
        System.out.println("the cosine of 90 degree is: " + Math.round(cosine));

        // Math.tan();
        degrees = 45.000;
        radians = Math.toRadians(degrees);
        double tangent = Math.tan(radians);
        System.out.println("the tangent of 45 degrees is: " + Math.round(tangent));

    }

}
