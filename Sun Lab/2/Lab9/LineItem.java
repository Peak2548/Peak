public class LineItem {
    private Product product;
    private int quantity;
    private int buyPrice;

    public LineItem(Product pro, int quantity, int buyPr) {
        product = pro;
        this.quantity = quantity;
        buyPrice = buyPr;
    }

    public int calculateAmount() {
        return quantity * buyPrice;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getBuyPrice() {
        return buyPrice;
    }
}