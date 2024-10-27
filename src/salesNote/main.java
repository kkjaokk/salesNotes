package salesNote;

public class main {
    public static void main(String[] args) {
        
        Product product1 = new Product("Tomato", 4.39);
        Product product2 = new Product("Apple", 3.90);
        Product product3 = new Product("Orange", 11.90);
        Product product4 = new Product("Ice Cream", 8.90);
        Product product5 = new Product("Cake", 5.00);
        Product product6 = new Product("Energy Monster", 9.90);

        
        SaleReceipt receipt = new SaleReceipt();

        
        receipt.addItem(product1, 2);
        receipt.addItem(product2, 1);
        receipt.addItem(product3, 3);
        receipt.addItem(product4, 2);
        receipt.addItem(product5, 1);
        receipt.addItem(product6, 3);

      
        receipt.displayReceipt();
    }
}
