import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Product retrieveProduct(String pName) {
        return productList.get(pName);
    }
    public int retrievePrice(String pName) {
        return priceList.get(pName);
    }
    public void add(Product item, int p) {
        productList.put(item.getName(), item);
        priceList.put(item.getName(), p);
    }
}