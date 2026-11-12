package com.joysistvi.day24.Activity17_Manito;

public class Ballpen extends Pen implements Refillable, Clickable{

    private double pointSize;

    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    // Added Methods from Interface
    @Override
    public void click() { System.out.print(CLICK_SOUND); }

    // method
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }
    @Override
    public void refill() { System.out.println("Replacing the ballpen ink refill."); }

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
        return "Type: Ballpen"  + "\n" +
                super.toString() + "\n" +
                "PointSize: " + pointSize;
    }
}
