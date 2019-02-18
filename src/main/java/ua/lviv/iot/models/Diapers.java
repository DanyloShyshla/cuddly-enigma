package ua.lviv.iot.models;

public class Diapers extends BabyShop {
    public int amountInPack;
    public DiapersSize diapersModelSize;
    public KidWeight kidWeightInKilo;

    public Diapers(
            String name,
            String brand,
            double price,
            SafetyStandard wareSafetyStandard,
            int goodAvailability,
            int warranty,
            double ageSuitability,
            String supplier,
            String country,
            int amountInPack,
            DiapersSize diapersModelSize,
            KidWeight kidWeightInKilo
    ) {
        super(name, brand, price, wareSafetyStandard, goodAvailability, warranty, ageSuitability, supplier, country);
    }

    public int getAmountInPack() {
        return amountInPack;
    }

    public void setAmountInPack(int amountInPack) {
        this.amountInPack = amountInPack;
    }

    public DiapersSize getDiapersModelSize() {
        return diapersModelSize;
    }

    public void setDiapersModelSize(DiapersSize diapersModelSize) {
        this.diapersModelSize = diapersModelSize;
    }

    public KidWeight getKidWeightInKilo() {
        return kidWeightInKilo;
    }

    public void setKidWeightInKilo(KidWeight kidWeightInKilo) {
        this.kidWeightInKilo = kidWeightInKilo;
    }
}
