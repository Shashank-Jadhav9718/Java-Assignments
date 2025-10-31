package ASS4.SETA;

import java.io.*;
import java.util.*;

public class Q2 {

    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(fr);

        StringBuilder content = new StringBuilder();
        String line;
        
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
            // System.out.println(content);
        }

        br.close(); 
        
        System.out.println("original Content in Uper case : ");
        System.out.print(content.toString().toUpperCase());
        
        System.out.println("\nContent in Reverse order :");
        System.out.print(content.reverse().toString());
    }
}

