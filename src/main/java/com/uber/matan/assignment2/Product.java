package com.uber.matan.assignment2;

public abstract class Product {

    private String name;
    private int barcode;
    private double basePrice;
    private double baseTax;

    public Product() {
    }

    public Product(String name, int barcode, double basePrice, double baseTax) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.baseTax = baseTax;
    }

    /**
     * This method returns final price (base tax * base price)
     *
     * @return the final price
     */
    public double getFinalPrice() {
        return baseTax * basePrice;
    }

    /*
     * getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(double baseTax) {
        this.baseTax = baseTax;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", barcode=" + barcode +
                ", basePrice=" + basePrice +
                ", baseTax=" + baseTax +
                '}';
    }
}
