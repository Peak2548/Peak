public class Drink extends Product {
    public Drink(String n, String d) {
        pName = n;
        desc = d;
    }

    @Override
    public String getters() {
        return pName;
    }
}
