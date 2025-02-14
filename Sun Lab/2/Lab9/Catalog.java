import java.util.Map;
import java.util.HashMap;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;
    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public Product retrieveProduct(String pName) {
        return productList.get(pName);
    }
    public int retrievePrice(String pName) {
        return priceList.get(pName);
    }
    public void add(Product item, int p) {
        productList.put(item.getters(), item);
        priceList.put(item.getters(), p);
    }
    public void showCatalog() {
        for (Map.Entry<String, Product> entry : productList.entrySet()) {
            String productName = entry.getKey();
            int price = priceList.get(productName);
            System.out.println(productName + " @ " + price);
        }
    }
}