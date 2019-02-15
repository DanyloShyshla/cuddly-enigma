package ua.lviv.iot.babyshop.models;

public class BabyShop {
    private String name;
    private String brand;
    private double price;
    private SAFETY_STANDARD wareSafetyStandard;
    private int goodAvailability;
    private int warranty;
    private double ageSuitability;
    private String supplier;
    private String country;

    public BabyShop(String name, String brand, double price, SAFETY_STANDARD wareSafetyStandard, int goodAvailability, int warranty, double ageSuitability, String supplier, String country) {
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

    public BabyShop(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SAFETY_STANDARD getWareSafetyStandard() {
        return wareSafetyStandard;
    }

    public void setWareSafetyStandard(SAFETY_STANDARD wareSafetyStandard) {
        this.wareSafetyStandard = wareSafetyStandard;
    }

    public int getGoodAvailability() {
        return goodAvailability;
    }

    public void setGoodAvailability(int goodAvailability) {
        this.goodAvailability = goodAvailability;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public double getAgeSuitability() {
        return ageSuitability;
    }

    public void setAgeSuitability(double ageSuitability) {
        this.ageSuitability = ageSuitability;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}