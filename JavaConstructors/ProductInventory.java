public class ProductInventory {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all ProductInventory objects)
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total product count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 85000);
        ProductInventory p2 = new ProductInventory("Smartphone", 25000);
        ProductInventory p3 = new ProductInventory("Headphones", 1500);

        // Display individual product details
        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Display total number of products created
        ProductInventory.displayTotalProducts();
    }
}
