package com.joysistvi.day22.Activity15_Manito;

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
    //method
    public void write() {
        System.out.println("Writing with a pen.");
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
