package ASS1.SETA;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        sc.close();
    }


    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // returns True or False
    boolean checkPass() {
        return marks > 40;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // Input details for the student
        s1.inputDetails();
        
        // Display the details
        s1.displayDetails();
        
        // Check and display the pass/fail status
        if (s1.checkPass()) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
    
    

