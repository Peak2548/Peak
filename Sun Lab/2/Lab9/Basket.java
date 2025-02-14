import java.util.ArrayList;

public class Basket {
    private ArrayList<LineItem> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void putInBasket(LineItem line) {
        items.add(line);
    }
    public void showItemsInBasket() {
        System.out.println("This basket contains");
        Catalog catalog = new Catalog();
        for (LineItem entry : items) {
            System.out.println(entry.getQuantity() + " of " + entry.getProduct().getters() + " @= " + entry.getBuyPrice());
        }
    }
    public void printInvoice() {
        int total = 0;
        int sumProduct = 0;
        System.out.println("invoice header");
        for (LineItem entry : items) {
            sumProduct = entry.getBuyPrice() * entry.getQuantity();
            System.out.println(entry.getProduct().getters() + " x " + entry.getQuantity() + " " + sumProduct);
            total += sumProduct;
        }
        System.out.println("Total is " + total);
    }
    private void loopLineItem() {

    }
}
