package ua.lviv.iot.manager;

public final class Main {
    public static void main(final String[] args) {
        System.out.println("---------------------");
        System.out.println("----- BABY SHOP -----");
        System.out.println("---------------------");
        ManagerImplementation name = new ManagerImplementation();
        name.addProduct();
        name.searchByAge(3);
        name.sortByPrice(false);
        System.out.println();
        name.sortByWarranty(true);
        System.out.println();
    }

    private Main() {
    }
}
