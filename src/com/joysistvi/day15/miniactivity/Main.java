package com.joysistvi.day15.miniactivity;

public class Main {
    public static void main(String[] args) {


        Ballpen ballpen = new Ballpen();

        ballpen.brand = "Philflex";
        ballpen.color = "Red";
        ballpen.ballSize = 0.7f;
        ballpen.inkType = "Oil-Based";

        ballpen.write();
        ballpen.labeling();
        ballpen.stab();

        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand = "iPen4";
        ballpen.color = "Blue";
        ballpen.ballSize = 1.0f;
        ballpen2.inkType = "Oil-Based";

        ballpen2.write();
        ballpen2.labeling();
        ballpen2.stab();

    }
}
