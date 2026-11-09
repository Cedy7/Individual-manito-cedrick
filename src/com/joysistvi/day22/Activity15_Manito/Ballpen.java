package com.joysistvi.day22.Activity15_Manito;

public class Ballpen extends Pen {

    private double pointSize;

    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    // method
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    // getters or Accessor Methods
    public double getPointSize() {
        return pointSize;
    }

    // setters or Mutator Methods
    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    @Override
    public String toString() {
        return "=== Ballpen ===" + "\n" +
                "Type: Ballpen"  + "\n" +
                super.toString() + "\n" +
                "PointSize: " + pointSize;
    }

}
