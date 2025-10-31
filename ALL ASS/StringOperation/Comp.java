package StringOperation;

public class Comp {
    public void compare(String s1, String s2) {
        boolean areEqual = s1.equals(s2);
        
        if (areEqual) {
            System.out.println("Comparison: The strings \"" + s1 + "\" and \"" + s2 + "\" are EQUAL.");
        } else {
            System.out.println("Comparison: The strings \"" + s1 + "\" and \"" + s2 + "\" are NOT EQUAL.");
        }
    }
}