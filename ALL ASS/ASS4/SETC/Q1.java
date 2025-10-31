package ASS4.SETC;

import java.io.*;
import java.util.*;

public class Q1 {

    private static final String FILENAME = "number.txt";
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- Integer Menu ---");
            System.out.println("1. Load (Generate Random)");
            System.out.println("2. Load (From File 'number.txt')");
            System.out.println("3. Save Numbers to file");
            System.out.println("4. Display Sum");
            System.out.println("5. Display Average");
            System.out.println("6. Display Maximum");
            System.out.println("7. Display Minimum");
            System.out.println("8. Display Current Numbers");
            System.out.println("9. Exit");
            System.out.print("Choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    loadRandomNumbers();
                    break;
                case 2:
                    loadNumbersFromFile();
                    break;
                case 3:
                    saveNumbers();
                    break;
                case 4:
                    displaySum();
                    break;
                case 5:
                    displayAverage();
                    break;
                case 6:
                    displayMaximum();
                    break;
                case 7:
                    displayMinimum();
                    break;
                case 8:
                    displayCurrentNumbers();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }

    private static void loadRandomNumbers() {
        numbers.clear();
        System.out.println("Generated 10 random 2-digit numbers:");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90) + 10;
            numbers.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void loadNumbersFromFile() throws IOException {
        numbers.clear();
        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        while ((line = br.readLine()) != null) {
            numbers.add(Integer.parseInt(line.trim()));
        }
        
        br.close();
        System.out.println("Loaded " + numbers.size() + " numbers from " + FILENAME);
    }

    private static void saveNumbers() throws IOException {
        if (numbers.isEmpty()) {
            System.out.println("No numbers to save. Load numbers first.");
            return;
        }

        FileWriter fw = new FileWriter(FILENAME);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Integer num : numbers) {
            bw.write(num.toString());
            bw.newLine();
        }
        
        bw.close();
        System.out.println("Successfully saved numbers to " + FILENAME);
    }

    private static void displayCurrentNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded.");
            return;
        }
        System.out.println("Current Numbers: " + numbers.toString());
    }

    private static void displaySum() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded.");
            return;
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    private static void displayAverage() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded.");
            return;
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.size();
        System.out.println("Average: " + avg);
    }

    private static void displayMaximum() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded.");
            return;
        }
        
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
    }

    private static void displayMinimum() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded.");
            return;
        }
        
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum: " + min);
    }
}

