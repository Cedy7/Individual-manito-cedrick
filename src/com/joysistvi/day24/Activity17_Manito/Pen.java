package com.joysistvi.day24.Activity17_Manito;

public abstract class Pen {
    private String brand;
    private String color;
    private double weightInGrams;

    // parameteried constructor
    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }
    // Abstract Method
    public abstract void write();

    // Non-Abstract Method
    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

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
