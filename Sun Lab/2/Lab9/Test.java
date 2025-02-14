public class Test {
    public static void main(String[] args) {
        // demo1();
        demo2();
    }

    static void demo1() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        catalog.add(new Noodles("mama", "duplicate"), 11);
        
        catalog.showCatalog();
    }
    static void demo2() {
        Catalog catalog = new Catalog();
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);

        String pName;
        int quantity;
        Basket b = new Basket();
        pName = "mama"; quantity = 1;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));
        pName = "lactasoy"; quantity = 2;
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), quantity, catalog.retrievePrice(pName)));

        b.showItemsInBasket();
        b.printInvoice();
    }
}
