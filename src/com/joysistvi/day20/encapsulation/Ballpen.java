package com.joysistvi.day20.encapsulation;

public class Ballpen {






    // data hiding -> making all the data members private
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGramps;


//    the following is accessor method

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }


//    the following is mutator method

    // setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // getter ---

    public double getPointSize() {
        return pointSize;
    }

    public double getWeightInGramps() {
        return weightInGramps;
    }


    // setter ---

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;

    }

    public void setWeightInGramps(double weightInGramps) {
        this.weightInGramps = weightInGramps;
    }


}
