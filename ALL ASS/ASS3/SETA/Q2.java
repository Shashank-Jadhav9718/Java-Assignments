package ASS3.SETA;

import java.util.Scanner;

abstract class Staff {
    
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

class OfficeStaff extends Staff {

    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Staff ID: " + id);
        System.out.println("Staff Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of staff members (n): ");
        int n = sc.nextInt();
        sc.nextLine(); 

        OfficeStaff[] staffList = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Staff " + (i + 1));
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            staffList[i] = new OfficeStaff(id, name, department);
        }

        System.out.println("\n--- All Staff Details ---");
        for (int i = 0; i < n; i++) {
            staffList[i].displayDetails();
        }

        sc.close();
    }
}