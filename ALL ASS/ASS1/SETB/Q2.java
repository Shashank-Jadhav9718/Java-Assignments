package ASS1.SETB;


import java.util.Scanner;

/**
 * Assignment 1, Set B, Question (b)
 * A menu-driven program to perform various math operations.
 */
public class Q2{

    // One scanner for the whole program
    static Scanner sc = new Scanner(System.in);

    /**
     * a. Calculates the volume of a cylinder
     * Formula: V = PI * r^2 * h
     */
    public static void calculateCylinderVolume() {
        System.out.print("\nEnter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Math.PI provides the value of PI
        double volume = Math.PI * radius * radius * height;
        
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);
    }

    /**
     * b. Finds the factorial of a given number
     * Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */
    public static void findFactorial() {
        System.out.print("\nEnter a number to find its factorial: ");
        int num = sc.nextInt();
        
        long factorial = 1; // Use 'long' to hold larger factorial values

        // Handle negative numbers, which don't have a factorial
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        // Factorial of 0 is 1
        else if (num == 0) {
            System.out.println("The factorial of 0 is: 1");
        } 
        // Calculate factorial for positive numbers
        else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }

    /**
     * c. Checks if a number is an Armstrong number
     * An Armstrong number is a number that is equal to the sum of
     * its own digits each raised to the power of the number of digits.
     * For 3-digit numbers, we check the sum of cubes.
     * Example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
     */
    public static void checkArmstrong() {
        System.out.print("\nEnter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int sum = 0;
        int digit;

        // Loop to extract digits
        while (num > 0) {
            digit = num % 10;     // Get the last digit
            sum += (digit * digit * digit); // Add the cube of the digit to sum
            num = num / 10;     // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }

    /**
     * d. Main method to run the menu
     */
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Math Operations Menu ---");
            System.out.println("1. Calculate Volume of Cylinder");
            System.out.println("2. Find Factorial of a Number");
            System.out.println("3. Check for Armstrong Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateCylinderVolume();
                    break;
                case 2:
                    findFactorial();
                    break;
                case 3:
                    checkArmstrong();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice != 4); // Keep running until the user selects 4

        // Close the scanner at the end of the program
        sc.close();
    }
}
