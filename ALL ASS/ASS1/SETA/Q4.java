package ASS1.SETA;
import java.util.Scanner;

public class Q4 {

    static Scanner sc = new Scanner(System.in);

    public static int[][] acceptMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element [%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void addMatrices() {
        System.out.print("Enter number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = sc.nextInt();

        System.out.println("\nEnter elements for Matrix 1:");
        int[][] m1 = acceptMatrix(rows, cols);

        System.out.println("\nEnter elements for Matrix 2:");
        int[][] m2 = acceptMatrix(rows, cols);

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("\n--- Result of Addition ---");
        displayMatrix(result, rows, cols);
    }

    public static void multiplyMatrices() {
        System.out.print("Enter rows for Matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter cols for Matrix 1: ");
        int cols1 = sc.nextInt();

        System.out.print("Enter rows for Matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter cols for Matrix 2: ");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("\nError: Cannot multiply!");
            System.out.println("Columns of Matrix 1 (" + cols1 + ") must equal Rows of Matrix 2 (" + rows2 + ").");
            return;
        }

        System.out.println("\nEnter elements for Matrix 1:");
        int[][] m1 = acceptMatrix(rows1, cols1);

        System.out.println("\nEnter elements for Matrix 2:");
        int[][] m2 = acceptMatrix(rows2, cols2);

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("\n--- Result of Multiplication ---");
        displayMatrix(result, rows1, cols2);  
    }

    // Transpose matrix
    public static void transposeMatrix() {
        System.out.print("Enter number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for the matrix: ");
        int cols = sc.nextInt();

        System.out.println("\nEnter elements for the Matrix:");
        int[][] matrix = acceptMatrix(rows, cols);

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        System.out.println("\n--- Original Matrix ---");
        displayMatrix(matrix, rows, cols);
        System.out.println("\n--- Transposed Matrix ---");
        displayMatrix(result, cols, rows); 
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==============================");
            System.out.println("     MATRIX OPERATIONS MENU");
            System.out.println("==============================");
            System.out.println("1. Add two matrices");
            System.out.println("2. Multiply two matrices");
            System.out.println("3. Find transpose of a matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addMatrices();
                case 2 -> multiplyMatrices();
                case 3 -> transposeMatrix();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
