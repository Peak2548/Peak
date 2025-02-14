public class Test {
    public static void main(String[] args) {
        demo1();
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
}
