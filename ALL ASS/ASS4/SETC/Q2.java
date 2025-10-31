package ASS4.SETC;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();

        try {
            validateName(name);
            System.out.println("Name is Valid: " + name);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name is Invalid: Cannot be empty.");
        }

        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                throw new InvalidNameException("Name is Invalid: Contains non-letter characters.");
            }
        }
    }
}
