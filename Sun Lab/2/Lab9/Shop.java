import java.util.ArrayList;

public class Shop {
    private String name;
    Catalog catalog;
    ArrayList<Basket> ordersToday;

    public Shop(String n) {
        name = n;
        catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        System.out.println("Shop " + name + " has been created.");
        showCatalog();
    }
    public void showCatalog() {

    }
    public Basket newCustomerArrives() {
        return
    }
    public void checkOut(Basket b) {

    }
    public void checkOut(Basket b, String pName) {

    }
    public Product getProduct(String pName) {
        return catalog.retrieveProduct(pName);
    }
    public int getPrice(String pName) {
        return catalog.retrievePrice(pName);
    }
}
