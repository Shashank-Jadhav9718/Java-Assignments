package ASS4.SETA;

import java.io.*;
import java.util.*;

public class Q3 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the source file (e.g., books.txt): ");
        String sourceFileName = sc.nextLine();

        System.out.print("Enter the name of the destination file (e.g., books_copy.txt): ");
        String destFileName = sc.nextLine();

        FileReader fr = new FileReader(sourceFileName);
        FileWriter fw = new FileWriter(destFileName);

        int character; 
        
        while ((character = fr.read()) != -1) {
            fw.write(character);
        }

        String newline = System.lineSeparator();
        String comment = "'end of file'";
        
        fw.write(newline); 
        fw.write(comment);
        fw.write(newline); 

        fr.close();
        fw.close();
        sc.close();

        System.out.println("Successfully copied content from " + sourceFileName +
                            " to " + destFileName + " and added the comment.");
    }
}

