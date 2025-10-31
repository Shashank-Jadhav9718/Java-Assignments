package ASS1.SETA;


public class Q3 {

    
    private int number;

    
    public Q3() {
        this.number = 0;
    }


    
    public Q3(int number) {
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


    public static void main(String[] args) {
    
        if (args.length > 0) {
            
        
            int val = Integer.parseInt(args[0]);
            
            Q3 numObj = new Q3(val);
            
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

