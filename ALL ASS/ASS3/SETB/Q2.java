package ASS3.SETB;


interface ProductMarker {
    // This is a marker interface, so it is empty.
}

class Product implements ProductMarker {
    
    private int product_id;
    private String product_name;
    private double product_cost;
    private int product_quantity;
    
    private static int objectCount = 0;

    public Product() {
        this.product_id = 0;
        this.product_name = "N/A";
        this.product_cost = 0.0;
        this.product_quantity = 0;
        objectCount++;
    }

    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++;
    }

    public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Product ID: " + this.product_id);
        System.out.println("Product Name: " + this.product_name);
        System.out.println("Product Cost: " + this.product_cost);
        System.out.println("Product Quantity: " + this.product_quantity);
        System.out.println("--------------------------");
    }
    
    public static int getObjectCount() {
        return objectCount;
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        System.out.println("Creating objects...");
        
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 1200.0, 5);
        Product p3 = new Product(102, "Mouse", 800.0, 10);

        System.out.println("\n--- Displaying Contents ---");
        
        System.out.println("Details for Product 1 (Default):");
        p1.displayDetails();
        
        System.out.println("Details for Product 2 (Parameterized):");
        p2.displayDetails();
        
        System.out.println("Details for Product 3 (Parameterized):");
        p3.displayDetails();

        System.out.println("\nTotal number of Product objects created: " + Product.getObjectCount());
    }
}