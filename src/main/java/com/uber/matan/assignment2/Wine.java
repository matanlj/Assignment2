package com.uber.matan.assignment2;

public class Wine extends Product {

    private float bottleVolume;

    /**
     * Each class in java has default constructor,
     * !!! if we don't create any constructor explicitly !!!,
     * java creates it implicitly for us and it looks like the following empty constructor.
     * And the important thing is that if we create parametrized constructor
     * we have to create default constructor explicitly to allow reflection frameworks(like Hibernate)
     * to work with our data(store to DB etc.)
     */
    public Wine() {
    }

    public Wine(String name, int barcode, double basePrice, double baseTax, float bottleVolume) {
        super(name, barcode, basePrice, baseTax);
        this.bottleVolume = bottleVolume;
    }

    /**
     * 5. products in wine class have extra tax of 10% which get added to the final price ((baseTax * basePrice) * alcoholTax)
     * 6.78: or finalPrice * alcoholTax
     * you need to override this method only in the wine class
     *
     * @return final price + 10%
     */
    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() * 1.1;
    }

    /*
     * getters and setters (common practice)
     */
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return "Wine{" +
                super.toString() +
                "bottleVolume=" + bottleVolume +
                "} ";
    }
}
