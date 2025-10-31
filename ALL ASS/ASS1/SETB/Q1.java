package ASS1.SETB;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Q1{

    public static void main(String[] args) {
        
        Date currentDate = new Date(); 

        
        // Format 1: dd/MM/yyyy (e.g., 31/08/2021)
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        
        // Format 2: MM-dd-yyyy (e.g., 08-31-2021)
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        
        // Format 3: EEEE MMMM dd yyyy (e.g., Tuesday August 31 2021)
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        
        // Format 4: E MMMM dd HH:mm:ss z yyyy (e.g., Fri August 31 15:25:59 IST 2021)
        SimpleDateFormat format4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        
        // Format 5: dd/MM/yy HH:mm:ss a Z (e.g., 31/08/21 15:25:59 PM +0530)
        SimpleDateFormat format6 = new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
        
        // Format 6: HH:mm:ss (e.g., 15:25:59)
        SimpleDateFormat format7 = new SimpleDateFormat("HH:mm:ss");
        
        // Format 7: w (week of year)
        SimpleDateFormat format8 = new SimpleDateFormat("w"); // small w
        
        // Format 8: W (week of month)
        SimpleDateFormat format9 = new SimpleDateFormat("W"); // Capitla W
        
        // Format 9: D (day of year)
        SimpleDateFormat format10 = new SimpleDateFormat("D");


        // 3. Print the formatted dates
        // The .format(date) method applies the pattern to the date
        System.out.println("Current date is: " + format1.format(currentDate));
        System.out.println("Current date is: " + format2.format(currentDate));
        System.out.println("Current date is: " + format3.format(currentDate));
        System.out.println("Current date and time is: " + format4.format(currentDate));
        System.out.println("Current date and time is: " + format6.format(currentDate));
        System.out.println("Current time is: " + format7.format(currentDate));
        System.out.println("Current week of year is: " + format8.format(currentDate));
        System.out.println("Current week of month: " + format9.format(currentDate));
        System.out.println("Current day of the year is: " + format10.format(currentDate));
    }
}
