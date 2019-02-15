package ua.lviv.iot.babyshop.models;

public class SkinCare extends BabyShop {
    public boolean hypoallergenic;
    public int bottleSizeInML;
    public SKIN_CARE_TYPE skinCareModelType;

    public SkinCare(String name, String brand, double price, SAFETY_STANDARD wareSafetyStandard, int goodAvailability, int warranty, double ageSuitability, String supplier, String country) {
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

    public SKIN_CARE_TYPE getSkinCareModelType() {
        return skinCareModelType;
    }

    public void setSkinCareModelType(SKIN_CARE_TYPE skinCareModelType) {
        this.skinCareModelType = skinCareModelType;
    }
}
