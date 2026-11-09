package com.joysistvi.day22.Activity15_Manito;
public class Pencil extends Pen{

    private String hardness;

    public Pencil(String brand, String color, double weightInGrams, String hardness) {
        super(brand, color, weightInGrams);
        this.hardness = hardness;
    }

    // method
    @Override
    public void write() {
        System.out.println("Writing smoothly with a Pencil.");
    }

    // getter or accessor method
    public String getHardness() {
        return hardness;
    }

    // setter or mutator method
    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "=== Pencil ===" + "\n" +
                "Type: Pencil" + "\n" +
                super.toString() + "\n" +
                "Hardness: " + hardness;
    }
}
