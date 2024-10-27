package salesNote;

public class SalesItem {
    private Product product;
    private int quantity;

    public SalesItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateItemTotal() {
        return product.getPrice() * quantity;
    }
}
