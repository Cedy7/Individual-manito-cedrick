package com.joysistvi.day13.string;

public class Activity10_Manito {
    public static void main(String[] args) {
        String hyperlink = "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html";
        String breakfast = "    java rice        ";

        //test if the hyperlink has oracle within it and output true if it has
        boolean result1 = hyperlink.contains("oracle");
        System.out.println(result1);

        //test if the hyperlink ends with html and output true if it has
        boolean result2 = hyperlink.endsWith("html");
        System.out.println(result2);

        //test if the hyperlink starts with https it and output true if it has
        boolean result3 = hyperlink.startsWith("https");
        System.out.println(result3);

        //check if the hyperlink has j within it and output the index position of
        // the first occurence of j if it has and return -1 if there is no j in it.
        int result4 = hyperlink.indexOf('j');
        System.out.println(result4);

        //removes all of the leadeing and trailling whitespaces in the string and
        // output the trimmed version of it.
        String result5 = breakfast.trim();
        System.out.println(result5);

        //replace the one character inside string breakfast and output the edited
        //version where the string is already edited.
        String result6 = breakfast.replace('c', 's');
        System.out.println(result6);

        //convert the string into character array where each element contains a
        //character from string.
        char[] result7 = result5.toCharArray();
        System.out.println(result7[0]);
    }
}
