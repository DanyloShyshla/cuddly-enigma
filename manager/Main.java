package ua.lviv.iot.babyshop.manager;

public class Main {
    public static void main(String[] args) {
        ManagerImplementation name = new ManagerImplementation();
        name.addProduct();
        name.searchByAge(3);
        name.sortByPrice(false);
        System.out.println();
        name.sortByWarranty(true);
        System.out.println();
    }
}
