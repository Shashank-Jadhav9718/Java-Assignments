package ASS4.SETA;

import java.util.Scanner;

class covidExp extends Exception {
    public covidExp(String msg){
        super(msg);
    }
}

class patient{
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    patient(String name , int age , int oxy_level , int HRCT_report){
        this.patient_name = name ; 
        this.patient_age = age;
        this.patient_oxy_level = oxy_level;
        this.patient_HRCT_report = HRCT_report;
    }

    void checkstatus() throws covidExp{
        if(patient_HRCT_report > 10 && patient_oxy_level < 95){
            throw new covidExp("Patient is Covid Positive (+) and Need to Hospitalixed ");
        }
        else {
            System.out.println("\n--- Patient Information ---");
                System.out.println("Name: " + this.patient_name);
                System.out.println("Age: " + this.patient_age);
                System.out.println("Oxygen Level: " + this.patient_oxy_level + "%");
                System.out.println("HRCT Report Score: " + this.patient_HRCT_report);
                System.out.println("Status: Patient is stable.");
                System.out.println("---------------------------");
        }
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the details of the Patient");
        System.out.print("Enter the name of patient : ");
        String name  = sc.nextLine();
        
        
        System.out.print("Enter the age of the patient : ");
        int age  = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Oxy level : ");
        int oxy_level = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the HRCT Scan Report : ");
        int HRCT = sc.nextInt();

        try{

            patient p1 = new patient(name,age,oxy_level,HRCT);
            p1.checkstatus();
        }catch (covidExp e ){
            System.out.println((e.getMessage()));
        }

    }
    
}
