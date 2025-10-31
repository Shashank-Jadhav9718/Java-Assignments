package ASS3.SETA;
import java.util.Scanner;

class Product {
    
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    static int objectCount = 0;

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
        System.out.println("Product Cost: Rs. " + this.product_cost);
        System.out.println("Product Quantity: " + this.product_quantity);

        if (this.product_cost > 1000) {
            double discountedCost = this.product_cost * 0.90; 
            System.out.println("Price after 10% discount: Rs. " + discountedCost);
        } else {
            System.out.println("No discount applicable.");
        }
        System.out.println("--------------------------");
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product #" + (i + 1));
            
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Product Cost: ");
            double cost = sc.nextDouble();
            
            System.out.print("Enter Product Quantity: ");
            int qty = sc.nextInt();

            products[i] = new Product(id, name, cost, qty);
        }

        System.out.println("\n--- All Product Details ---");
        for (int i = 0; i < n; i++) {
            products[i].displayDetails();
        }

        System.out.println("\nTotal number of Product objects created: " + Product.getObjectCount());
        
        sc.close();
    }
}
            