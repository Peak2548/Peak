import java.util.ArrayList;

public class Shop {
    private String name;
    Catalog catalog;
    ArrayList<Basket> ordersToday;

    public Shop(String n) {
        name = n;
        ordersToday = new ArrayList<>();
        catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        System.out.println("Shop " + name + " has been created.\nWelcom to CS");
        showCatalog();
    }
    public void showCatalog() {
        catalog.showCatalog();
    }
    public Basket newCustomerArrives() {
        Basket b = new Basket();
        ordersToday.add(b);
        return b;
    }
    public void checkOut(Basket b) {
        System.out.println("I am cashier");
        b.printInvoice();
        ordersToday.remove(b);
    }
    public void checkOut(Basket b, String pName) {
        System.out.println("Quickly put it in his shopping bag");
        b.putInBasket(new LineItem(getProduct(pName), 1, getPrice(pName)));
        b.printInvoice();
        ordersToday.remove(b);
    }
    public Product getProduct(String pName) {
        return catalog.retrieveProduct(pName);
    }
    public int getPrice(String pName) {
        return catalog.retrievePrice(pName);
    }
    // public void dailySalesReport() {
    //     int totalSales = 0;
    //     System.out.println("Daily Sales Report");
    //     for (Basket b : ordersToday) {
    //         b.
    //     }
    //     System.out.println("Total Sales: " + totalSales);
    // }
}
