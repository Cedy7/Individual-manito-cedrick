package com.joysistvi.day23.Activity16_Manito;

public class Pen {
    private String brand;
    private String color;
    private double weightInGrams;

    // parameteried constructor
    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }
    // Method
    public void write() {
        System.out.println("Writing with a pen.");
    }
    public void refill() { System.out.println("Refilling the pen."); }

    // Overloaded Methods
    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    // Overloaded Methods
    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    // getters or accessor methods
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public double getWeightInGrams() {
        return weightInGrams;
    }


    // setters or mutator methods
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Color: " + color + '\n' +
                "WeightInGrams: " + weightInGrams;
    }
}
