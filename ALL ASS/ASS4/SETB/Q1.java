package ASS4.SETB;

import java.io.*;
import java.util.Scanner;

public class Q1 {

    private static final String FILENAME = "books_data.txt";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Menu ---");
            System.out.println("1. Search by Name");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    searchBook(sc);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }

    private static void searchBook(Scanner sc) throws IOException {
        System.out.print("Enter Book Name: ");
        String searchName = sc.nextLine();
        boolean found = false;

        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[1].trim();

            if (name.equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + line);
                found = true;
                break;
            }
        }
        
        br.close();
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    private static void displayAllBooks() throws IOException {
        double totalCost = 0;
        int count = 0;
        System.out.println("\n--- All Books ---");

        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String[] parts = line.split(",");
            int price = Integer.parseInt(parts[2]);
            int qty = Integer.parseInt(parts[3]);

            totalCost += (price * qty);
            count++;
        }
        
        br.close();

        if (count == 0) {
            System.out.println("No books in file.");
        } else {
            System.out.println("\nTotal Cost: " + totalCost);
            System.out.println("Total Books: " + count);
        }
    }
}

