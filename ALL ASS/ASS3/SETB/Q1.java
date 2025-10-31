package ASS3.SETB;

import java.util.Scanner;

abstract class Order {
    int id;
    String description;

    public abstract void accept(Scanner sc);
    public abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    @Override
    public void accept(Scanner sc) {
        System.out.print("Enter Order ID: ");
        this.id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Order Description: ");
        this.description = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        this.customerName = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("--- Purchase Order ---");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
        System.out.println("----------------------");
    }
}

class SalesOrder extends Order {
    String vendorName;

    @Override
    public void accept(Scanner sc) {
        System.out.print("Enter Order ID: ");
        this.id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Order Description: ");
        this.description = sc.nextLine();
        System.out.print("Enter Vendor Name: ");
        this.vendorName = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("--- Sales Order ---");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("-------------------");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PurchaseOrder[] poList = new PurchaseOrder[3];
        SalesOrder[] soList = new SalesOrder[3];

        System.out.println("--- Enter 3 Purchase Orders ---");
        for(int i = 0; i < poList.length; i++) {
            System.out.println("\nEntering Purchase Order #" + (i + 1));
            poList[i] = new PurchaseOrder();
            poList[i].accept(sc);
        }

        System.out.println("\n--- Enter 3 Sales Orders ---");
        for(int i = 0; i < soList.length; i++) {
            System.out.println("\nEntering Sales Order #" + (i + 1));
            soList[i] = new SalesOrder();
            soList[i].accept(sc);
        }

        System.out.println("\n--- Displaying All Purchase Orders ---");
        for(int i = 0; i < poList.length; i++) {
            poList[i].display();
        }

        System.out.println("\n--- Displaying All Sales Orders ---");
        for(int i = 0; i < soList.length; i++) {
            soList[i].display();
        }

        sc.close();
    }
}
