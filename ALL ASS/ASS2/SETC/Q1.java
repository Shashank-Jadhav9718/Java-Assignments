package ASS2.SETC;

import StringOperation.Concate;
import StringOperation.Comp;

public class Q1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        // Test Concatenation
        Concate c = new Concate();
        c.concatenate(str1, str2);

        System.out.println("--------------------");

        // Test Comparison
        Comp cp = new Comp();
        cp.compare(str1, str2);
        cp.compare(str1, str3);
    }
}