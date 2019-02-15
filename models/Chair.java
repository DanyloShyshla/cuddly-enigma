package ua.lviv.iot.babyshop.models;

public class Chair extends BabyShop {

    private double height;
    private double width;
    private double depth;
    private double weightLimit;
    private String material;

    public Chair(
            String name,
            String brand,
            double price,
            SAFETY_STANDARD wareSafetyStandard,
            int goodAvailability,
            int warranty,
            double ageSuitability,
            String supplier,
            String country,
            double height,
            double width,
            double depth,
            double weightLimit,
            String material

    ) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public Chair(){}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
