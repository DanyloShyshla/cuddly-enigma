package ua.lviv.iot.babyshop.models;

public class Diapers extends BabyShop {
    public int amountInPack;
    public DIAPERS_SIZE diapersModelSize;
    public KID_WEIGHT kidWeightInKilo;

    public Diapers(
            String name,
            String brand,
            double price,
            SAFETY_STANDARD wareSafetyStandard,
            int goodAvailability,
            int warranty,
            double ageSuitability,
            String supplier,
            String country,
            int amountInPack,
            DIAPERS_SIZE diapersModelSize,
            KID_WEIGHT kidWeightInKilo
    ) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public int getAmountInPack() {
        return amountInPack;
    }

    public void setAmountInPack(int amountInPack) {
        this.amountInPack = amountInPack;
    }

    public DIAPERS_SIZE getDiapersModelSize() {
        return diapersModelSize;
    }

    public void setDiapersModelSize(DIAPERS_SIZE diapersModelSize) {
        this.diapersModelSize = diapersModelSize;
    }

    public KID_WEIGHT getKidWeightInKilo() {
        return kidWeightInKilo;
    }

    public void setKidWeightInKilo(KID_WEIGHT kidWeightInKilo) {
        this.kidWeightInKilo = kidWeightInKilo;
    }
}
