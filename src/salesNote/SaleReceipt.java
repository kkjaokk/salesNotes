package salesNote;

import java.util.ArrayList;
import java.util.List;

public class SaleReceipt {
    private List<SalesItem> items;

    public SaleReceipt() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        SalesItem item = new SalesItem(product, quantity);
        items.add(item);
    }

    public double calculateTotalSale() {
        double total = 0.0;
        for (SalesItem item : items) {
            total += item.calculateItemTotal();
        }
        return total;
    }

    public void displayReceipt() {
        System.out.println("<<<< SALE NOTE >>>>");
        System.out.println("\n");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Total");

        for (SalesItem item : items) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", 
                item.getProduct().getName(),
                item.getQuantity(),
                item.getProduct().getPrice(),
                item.calculateItemTotal());
        }
        
        System.out.println("\n");
        System.out.println("==========================");
        System.out.printf("TOTAL SALE: $ %.2f\n", calculateTotalSale());
    }
}
