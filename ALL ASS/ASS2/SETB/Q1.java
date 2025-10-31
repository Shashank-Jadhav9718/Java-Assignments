package ASS2.SETB;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter person's name (first middle last):");
        
        String fullName = sc.nextLine();

        String[] parts = fullName.split(" ");

        if (parts.length >= 3) {
            String firstName = parts[0];
            String middleName = parts[1];
            String lastName = parts[2];

            // Get the first character and make it uppercase
            String middleFirstLetter = middleName.substring(0, 1).toUpperCase();
            
            // Get the rest of the name and make it lowercase
            String middleRest = middleName.substring(1).toLowerCase();
            
            // Combine them to get "Middle"
            String formattedMiddleName = middleFirstLetter + middleRest;

            // Print in the new format: Last First Middle
            System.out.print("Formatted name:");
            System.out.println(lastName + " " + firstName + " " + formattedMiddleName);

        } else {
            System.out.println("Invalid format. Please enter a first, middle, and last name.");
        }

        // Close the scanner
        sc.close();
    }
}