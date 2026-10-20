package com.joysistvi.day5.RelationalOperator;

public class Activity3_Manito {
    public static void main(String [] args) {

        int age = 18;
        boolean hasValidID = true;

        boolean isAllowedToEnter = age >= 18 && hasValidID == true;

        String result1 = isAllowedToEnter ? "Yes, Allowed to Enter." : "No, Not Allowed to Enter.";

        System.out.println("Is the person allowed to enter?: " + result1);

        boolean isWeekend = false;
        boolean isHoliday = false;

        boolean isRegularWeekdayToday = isWeekend == true || isHoliday == true;

        String result2 = (isRegularWeekdayToday == false) ? "Yes, There is a class today." : "No, There is no class today.";

        System.out.println("Is there a class today?: " + result2);

        int score = 75;

        String result3 = (score >= 75) ? "Passed" : "Failed";

        System.out.println("Grade of student X this semester: " + result3);

        int num = 20;
        int num2 = 10;

        int result4 = (num > num2) ? num : num2;

        System.out.println("Which number holds the larger number?: " + result4);

    }
}
