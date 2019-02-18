package ua.lviv.iot.models;

public class SkinCare extends BabyShop {
    public boolean hypoallergenic;
    public int bottleSizeInML;
    public SkinCareType skinCareModelType;

    public SkinCare(String name, String brand, double price, SafetyStandard wareSafetyStandard, int goodAvailability, int warranty, double ageSuitability, String supplier, String country) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public int getBottleSizeInML() {
        return bottleSizeInML;
    }

    public void setBottleSizeInML(int bottleSizeInML) {
        this.bottleSizeInML = bottleSizeInML;
    }

    public SkinCareType getSkinCareModelType() {
        return skinCareModelType;
    }

    public void setSkinCareModelType(SkinCareType skinCareModelType) {
        this.skinCareModelType = skinCareModelType;
    }
}
