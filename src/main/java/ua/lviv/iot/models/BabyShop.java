package ua.lviv.iot.models;

public class BabyShop {
    private String name;
    private String brand;
    private double price;
    private SafetyStandard wareSafetyStandard;
    private int goodAvailability;
    private int warranty;
    private double ageSuitability;
    private String supplier;
    private String country;

    public BabyShop(
            final String name,
            final String brand,
            final double price,
            final SafetyStandard wareSafetyStandard,
            final int goodAvailability,
            final int warranty,
            final double ageSuitability,
            final String supplier,
            final String country
    ) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.wareSafetyStandard = wareSafetyStandard;
        this.goodAvailability = goodAvailability;
        this.warranty = warranty;
        this.ageSuitability = ageSuitability;
        this.supplier = supplier;
        this.country = country;
    }

    public BabyShop() { }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public SafetyStandard getWareSafetyStandard() {
        return wareSafetyStandard;
    }

    public void setWareSafetyStandard(final SafetyStandard wareSafetyStandard) {
        this.wareSafetyStandard = wareSafetyStandard;
    }

    public int getGoodAvailability() {
        return goodAvailability;
    }

    public void setGoodAvailability(final int goodAvailability) {
        this.goodAvailability = goodAvailability;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(final int warranty) {
        this.warranty = warranty;
    }

    public double getAgeSuitability() {
        return ageSuitability;
    }

    public void setAgeSuitability(final double ageSuitability) {
        this.ageSuitability = ageSuitability;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(final String supplier) {
        this.supplier = supplier;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }
}
