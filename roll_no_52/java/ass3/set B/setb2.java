// Marker interface
interface Countable {
}

// Product class
class Product implements Countable {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;
    private static int objectCount = 0; // Static variable to track object count

    // Default constructor
    public Product() {
        objectCount++; // Increment object count when an object is created
    }

    // Parameterized constructor
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++; // Increment object count when an object is created
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println();
    }

    // Static method to display object count
    public static void displayObjectCount() {
        System.out.println("Total number of products created: " + objectCount);
    }
}

public class setb2 {
    public static void main(String[] args) {
        // Create objects of class Product
        Product product1 = new Product(1, "Laptop", 999.99, 5);
        Product product2 = new Product(2, "Smartphone", 599.99, 10);
        Product product3 = new Product(3, "Headphones", 49.99, 20);

        // Display the contents of each object
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();

        // Display the object count
        Product.displayObjectCount();
    }
}
