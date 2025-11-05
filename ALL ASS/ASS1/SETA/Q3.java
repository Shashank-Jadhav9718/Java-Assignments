package ASS1.SETA;

class Mynumber{
        private int number;

    
    public Mynumber() {
        this.number = 0;
    }


    
    public Mynumber(int number) {
        this.number = number; // 'this' disambiguates field from parameter
    }


    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }


    public boolean isZero() {
        return number == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }


    public boolean isEven() {
        return number % 2 == 0;
    }


}

public class Q3 {


    public static void main(String[] args) {
    
        if (args.length > 0) {
            
        
            int val = Integer.parseInt(args[0]);
            
            Mynumber numObj = new Mynumber(val);
            
            System.out.println("--- Testing Number: " + val + " ---");
            

            if (numObj.isPositive()) {
                System.out.println("The number is positive.");
            } else if (numObj.isNegative()) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
            
        
            if (numObj.isEven()) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        

        } else {
            System.out.println("No argument provided. Please provide a number as a command-line argument.");
        }
    }
}

