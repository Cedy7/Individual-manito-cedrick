package com.joysistvi.day21.encap;


public class Ballpen {

    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;


//
//    // default constructor
//    public Ballpen() {}


    //  / parameterized constructor (special method)
    public Ballpen(String brand, String color, double pointSize, double weightInGramps){
        this.brand = brand;
        this.color = color;
        this.pointSize = pointSize;
        this.weightInGrams = weightInGramps;
    }



    // Shortcut to generate Getter and Setter: alt + insert

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getBallSize() {
        return pointSize;
    }

    public double getInkType() {
        return weightInGrams;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBallSize(double ballSize) {
        this.pointSize = ballSize;
    }

    public void setInkType(double inkType) {
        this.weightInGrams = inkType;
    }

    // String representation of object
    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color  + "\n" +
                "Point Size: " + pointSize + "\n" +
                "Weight in Grams: " + weightInGrams;
    }


}


/*

    // String representation of object

    @Override
    public String toString() {
        return "Ballpen{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", pointSize=" + pointSize +
                ", weightInGrams=" + weightInGrams +
                '}';
    }
 */