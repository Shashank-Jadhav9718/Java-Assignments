package ASS2.SETA;

import SY.SYMarks;
import TY.TYMarks;

class Student {
    int rollNumber;
    String name;
    SYMarks syMarks;
    TYMarks tyMarks;

    public Student(int roll, String name, SYMarks sy, TYMarks ty) {
        this.rollNumber = roll;
        this.name = name;
        this.syMarks = sy;
        this.tyMarks = ty;
    }

    public double getAverage() {
        int syComp = this.syMarks.ComputerTotal;
        int tyComp = this.tyMarks.Theory + this.tyMarks.Practicals;
        
        double average = (double)(syComp + tyComp) / 2.0;
        return average;
    }

    public String calculateGrade() {
        double average = getAverage();
        
        if (average >= 70) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 40) {
            return "Pass Class";
        } else {
            return "FAIL";
        }
    }

    public void displayResult() {
        System.out.println("----- Student Result -----");
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("SY Computer Marks: " + this.syMarks.ComputerTotal);
        System.out.println("TY Computer Marks: " + (this.tyMarks.Theory + this.tyMarks.Practicals));
        System.out.println("Average: " + getAverage());
        System.out.println("Final Grade: " + calculateGrade());
        System.out.println("--------------------------\n");
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        SYMarks sy1 = new SYMarks(80, 75, 70);
        TYMarks ty1 = new TYMarks(60, 30);
        
        Student student1 = new Student(101, "XYZ", sy1, ty1);

        SYMarks sy2 = new SYMarks(40, 50, 60);
        TYMarks ty2 = new TYMarks(20, 15);
        
        Student student2 = new Student(102, "PQR", sy2, ty2);

        student1.displayResult();
        student2.displayResult();
    }
}