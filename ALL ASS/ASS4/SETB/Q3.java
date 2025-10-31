package ASS4.SETB;

import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    public MyDate(int d, int m, int y) throws InvalidDateException {
        validateDate(d, m, y);
        this.day = d;
        this.month = m;
        this.year = y;
    }

    private void validateDate(int d, int m, int y) throws InvalidDateException {
        if (m < 1 || m > 12) {
            throw new InvalidDateException("Invalid Date: Month must be between 1 and 12.");
        }
        
        int[] daysInMonth = { 
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 
        };

        if (isLeap(y)) {
            daysInMonth[2] = 29;
        }

        if (d < 1 || d > daysInMonth[m]) {
            throw new InvalidDateException(
                "Invalid Date: Day " + d + " is not valid for month " + m + " in year " + y
            );
        }
    }

    private boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter date as dd mm yyyy (e.g., 25 12 2023):");
            
            System.out.print("Enter Day (dd): ");
            int d = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Month (mm): ");
            int m = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Year (yyyy): ");
            int y = Integer.parseInt(sc.nextLine());

            MyDate date = new MyDate(d, m, y);
            date.display();

        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for day, month, and year.");
        } finally {
            sc.close();
        }
    }
}

