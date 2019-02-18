package ua.lviv.iot.models;

public class Thermometer extends BabyShop{

    public String color;
    public ThermometerType thermometerModelType;

    public Thermometer(String name, String brand, double price, SafetyStandard wareSafetyStandard, int goodAvailability, int warranty, double ageSuitability, String supplier, String country) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ThermometerType getThermometerModelType() {
        return thermometerModelType;
    }

    public void setThermometerModelType(ThermometerType thermometerModelType) {
        this.thermometerModelType = thermometerModelType;
    }
}
