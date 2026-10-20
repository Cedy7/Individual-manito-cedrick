package com.joysistvi.day6.ifstatement;

public class IfElseIfLadder {
    public static void main(String[] args) {
        // This program evaluates
        // A(90+) B(80+) C(70+) F(70-)

        int grade = 0;
        String result = "";

        //early exit
        // Terminates the method immediately if the grade is outside the valid range 1 - 100
        if (!(grade >= 1 && grade <= 100)) {
            return; //will exit or terminate the main method
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);


    }
}

/*

        //Nested
        if (grade >= 1 && grade <= 100) {

            if(grade <= 70) {
                result = "F";
            } else if (grade <= 80){
                result = "C";
            } else if (grade <= 90) {
                result = "B";
            } else  {
                result = "A";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else if (grade == 0) {
            System.out.println("inc or incomplete");
        } else {
            System.out.println("Invalid Grade");
        }


   //       false part 0 will be  F
        //if(grade <= 70) {
         //   result = "F";
        //} else if (grade <= 80){
            result = "C";
        //} else if (grade <= 90) {
         //   result = "B";
        //} else if (grade <= 100) {
          //  result = "A";
       // } else {
         //   result = "Invalid Grade";
        //}
        //pwedeng ilagay sa else sir yung "inc or incomplete" para kahit 0 yung ilagay ,

        //System.out.println("Grade: " + grade);
       // System.out.println("Classification: " + result);



        if(grade <= 70) {
            result = "F";
        } else if (grade >= 71 && grade <= 80){
               result = "C";
        } else if (grade >= 81 && grade <= 90) {
        result = "B";
        } else{
result = "A";
        }



int day = -1;
        String dayName = "";

        if (day ==1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is
            dayName = "Saturday";
        } else {
            // Executes when day is Invalid
            dayName = "Invalid Day";
        }
        System.out.println(dayName);
 */