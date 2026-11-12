package com.joysistvi.day24.Activity17_Manito;

public class Pencil extends Pen implements Refillable{

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
    @Override
    public void refill() { System.out.println("Replacing the pencil lead."); }

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
        return "Type: Pencil" + "\n" +
                super.toString() + "\n" +
                "Hardness: " + hardness;
    }
}
