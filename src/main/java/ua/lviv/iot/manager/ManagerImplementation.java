package ua.lviv.iot.manager;

import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.List;

public class ManagerImplementation implements Shopping {

    private List<BabyShop> kidGoodsList = new ArrayList<>();

    @Override
    public void searchByAge(double ageSuitability) {
        kidGoodsList.stream().filter(p -> { return p.getAgeSuitability() == ageSuitability;
        }).forEach((wares) -> System.out.println(wares.toString()));
    }

    @Override
    public void sortByPrice(boolean reverse) {

        int reverser = reverse ? -1 : 1;
        kidGoodsList.sort((BabyShop objectFirst, BabyShop objectSecond) -> (int) (reverser * (objectFirst.getPrice() - objectSecond.getPrice())));
        kidGoodsList.forEach((shop) -> System.out.println(shop.getPrice()));

    }

    @Override
    public void sortByWarranty(boolean reverse){

        int reverser = reverse ? -1 : 1;
        kidGoodsList.sort((BabyShop objectFirst, BabyShop objectSecond) -> (int) (reverser * (objectFirst.getWarranty() - objectSecond.getWarranty())));
        kidGoodsList.forEach((shop) -> System.out.println(shop.getWarranty()));
    }

    public void addProduct() {

        kidGoodsList.add(new Chair("Brand chair","Chicco", 2999.99, SafetyStandard.EN_1400_2016, 14, 30, 3, "National delievery", "Ukraine", 56, 44, 42, 42, "wood"));

        kidGoodsList.add(new SkinCare("Creme for hands", "Bubchen", 40, SafetyStandard.EN_1400_2019, 30, 0, 3, "Bubchen company", "Germany"));

        kidGoodsList.add(new Chair("Space baby activity chair", "Bloom baby", 4799.99, SafetyStandard.EN_1400_2016, 4, 365, 5, "Bloom baby Ukraine logistics", "USA", 82, 46, 46, 55, "wood"));

        kidGoodsList.add(new Thermometer("Baby brand thermometer", "Gucci", 6999.99, SafetyStandard.EN_1400_2019, 1, 365, 3, "Gucci Ukraine", "Italy"));

        kidGoodsList.add(new Diapers("Diapers active baby", "Pampers", 899.99, SafetyStandard.EN_1400_2016, 40, 0, 3, "Pampers logistics", "China", 174, DiapersSize.MEDIUM, KidWeight.FROM_4_TO_9));



    }
}
