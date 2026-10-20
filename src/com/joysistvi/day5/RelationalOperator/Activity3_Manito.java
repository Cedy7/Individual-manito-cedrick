package com.joysistvi.day5.RelationalOperator;

public class Activity3_Manito {
    public static void main(String [] args) {

        int age = 18;
        boolean hasValidID = true;

        boolean isAllowedToEnter = age >= 18 && hasValidID == true;

        String result1 = isAllowedToEnter ? "Yes" : "No";

        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Allowed to enter the event: " + result1);
        System.out.println();

        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean noClassToday = isWeekend == true || isHoliday == true;

        String result2 = (noClassToday == true) ? "Yes, no classes." : "No, There is a class today.";

        System.out.println("--- Task 3: Class Status Check ---");
        System.out.println("Are there no classes today? " + result2);
        System.out.println();

        int score = 85;

        String result3 = (score >= 75) ? "Passed" : "Failed";

        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result3);
        System.out.println();

        int num = 10;
        int num2 = 25;

        int result4 = (num > num2) ? num : num2;

        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + ", " + "Number 2: " + num2);
        System.out.println("The larger number is: " + result4);

    }
}
