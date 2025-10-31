package ASS1.SETC;


public class Q3 {

    public static void main(String[] args) {
        
        System.out.println("--- Multiplication Tables from 1 to 15 ---");

        for (int i = 1; i <= 15; i++) {
            
            // Print a header for the current table
            System.out.println("\nTable of " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                
                int result = i * j;
                
                System.out.printf("%d x %d = %d\n", i, j, result);
            }
        }
    }
}

