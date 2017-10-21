package uber.matan.assignment2;

abstract class Product {
    private String name;
    private int barcode;
    private double basePrice;
    private double baseTax;
    public double finalPrice() {
        return baseTax * basePrice;
    }
}
