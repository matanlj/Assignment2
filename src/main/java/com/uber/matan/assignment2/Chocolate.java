package com.uber.matan.assignment2;

public class Chocolate extends Product {

    private float weight;

    public Chocolate() {
    }

    public Chocolate(String name, int barcode, double basePrice, double baseTax, float weight) {
        super(name, barcode, basePrice, baseTax);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                super.toString() +
                "weight=" + weight +
                "} ";
    }
}
