package ua.lviv.iot.babyshop.models;

public class Thermometer extends BabyShop{

    public String color;
    public  THERMOMETER_TYPE thermometerModelType;

    public Thermometer(String name, String brand, double price, SAFETY_STANDARD wareSafetyStandard, int goodAvailability, int warranty, double ageSuitability, String supplier, String country) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public THERMOMETER_TYPE getThermometerModelType() {
        return thermometerModelType;
    }

    public void setThermometerModelType(THERMOMETER_TYPE thermometerModelType) {
        this.thermometerModelType = thermometerModelType;
    }
}
