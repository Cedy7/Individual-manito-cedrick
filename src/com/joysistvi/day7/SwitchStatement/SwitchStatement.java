package com.joysistvi.day7.SwitchStatement;

public class SwitchStatement {
    public static void main (String [] args ) {
        String sizeCode = "";
        String sizeDescription = "";

        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":
                sizeDescription = "Extra Large";
                break;
            default:
                sizeDescription = "Invalid Size Code! Please enter XS, S, M, L, or XL";

        }

        System.out.println("Size: " + sizeDescription);

    }
}

/*

int day = 7;
        String dayName = "";

        //not allowed: boolean. long, float, double
        //allowed: String, byte, short, int, enum
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
        }

        System.out.println("Today is " + dayName);

 */