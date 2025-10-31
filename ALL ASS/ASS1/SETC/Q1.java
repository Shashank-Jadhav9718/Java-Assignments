package ASS1.SETC;


import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many country names do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        String[] countries = new String[n];


        System.out.println("Please enter the " + n + " country names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Country " + (i + 1) + ": ");
            countries[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                
                if (countries[j].compareTo(countries[j + 1]) < 0) {
                
                    String temp = countries[j];
                    countries[j] = countries[j + 1];
                    countries[j + 1] = temp;
                }
            }
        }

    
        System.out.println("\nCountries sorted in descending order (Z-A):");
        for (int i = 0; i < n; i++) {
            System.out.println(countries[i]);
        }
        
        sc.close();
    }
}

