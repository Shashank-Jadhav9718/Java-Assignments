package ASS2.SETC;

public class Q2 {
    
    public static void main(String[] args) {

        if (args.length != 5) {
            System.out.println("Error! Please provide exactly 5 numbers when you run this.");
            return;
        }

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println("The numbers you entered (original order):");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("The numbers in sorted order:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}