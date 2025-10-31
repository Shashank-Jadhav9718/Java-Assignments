package ASS1.SETC;

import java.util.Scanner;

public class Q2{

    static Scanner sc = new Scanner(System.in);

    public static int[][] inputMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("The matrix is:");
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("\nSum of main diagonal elements: " + sum);
    }

    public static void sumUpperDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > i) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of upper diagonal elements: " + sum);
    }

    public static void sumLowerDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of lower diagonal elements: " + sum);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Error: These operations require a square matrix (rows must equal columns).");
            sc.close();
            return;
        }
        
        int size = rows;
        
        int[][] matrix = inputMatrix(size, size);
        displayMatrix(matrix);

        int choice;
        do {
            System.out.println("\n--- Diagonal Operations Menu ---");
            System.out.println("1. Sum of main diagonal elements");
            System.out.println("2. Sum of upper diagonal elements");
            System.out.println("3. Sum of lower diagonal elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sumDiagonal(matrix, size);
                    break;
                case 2:
                    sumUpperDiagonal(matrix, size);
                    break;
                case 3:
                    sumLowerDiagonal(matrix, size);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}


