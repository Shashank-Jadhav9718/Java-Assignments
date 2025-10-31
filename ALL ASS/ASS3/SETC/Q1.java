package ASS3.SETC;
import java.util.Scanner;

interface Department {
    void setDepartment(String deptName, String deptHead);
    void printDepartmentDetails();
}

class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    public void printHostelDetails() {
        System.out.println("Hostel Name: " + this.hostelName);
        System.out.println("Hostel Location: " + this.hostelLocation);
        System.out.println("Number of Rooms: " + this.numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    
    private String deptName;
    private String deptHead;

    public Student(String studentName, int regNo, String electiveSubject, double avgMarks,
                    String hostelName, String hostelLocation, int numberOfRooms,
                    String deptName, String deptHead) {
                    
        super(hostelName, hostelLocation, numberOfRooms);
        
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public int getRegNo() {
        return this.regNo;
    }

    @Override
    public void setDepartment(String deptName, String deptHead) {
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    @Override
    public void printDepartmentDetails() {
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Department Head: " + this.deptHead);
    }
    
    public void printData() {
        System.out.println("=====================================");
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Registration No: " + this.regNo);
        System.out.println("Elective Subject: " + this.electiveSubject);
        System.out.println("Average Marks: " + this.avgMarks);
        
        printHostelDetails();
        printDepartmentDetails();
        
        System.out.println("=====================================");
    }
}

public class Q1 {
    
    public static Student findStudent(Student[] list, int count, int regNoToFind) {
        for (int i = 0; i < count; i++) {
            if (list[i].getRegNo() == regNoToFind) {
                return list[i]; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxStudents = 10;
        Student[] studentList = new Student[maxStudents];
        int currentStudentCount = 0;
        
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student (Change Department)");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                
                case 1:
                    System.out.println("\n--- Admit New Student ---");
                    
                    if (currentStudentCount >= maxStudents) {
                        System.out.println("Error: Student database is full. Cannot add more students.");
                        break; 
                    }
                    
                    System.out.print("Enter Student Name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter Registration No: ");
                    int regNo = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Elective Subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter Average Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine(); 
                    
                    System.out.print("Enter Hostel Name: ");
                    String hName = sc.nextLine();
                    System.out.print("Enter Hostel Location: ");
                    String hLoc = sc.nextLine();
                    System.out.print("Enter Number of Rooms: ");
                    int rooms = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Department Name: ");
                    String dName = sc.nextLine();
                    System.out.print("Enter Department Head: ");
                    String dHead = sc.nextLine();
                    
                    Student newStudent = new Student(sName, regNo, subject, marks, hName, hLoc, rooms, dName, dHead);
                    
                    studentList[currentStudentCount] = newStudent;
                    
                    currentStudentCount++;
                    
                    System.out.println("Student admitted successfully!");
                    break;
                    
                case 2:
                    System.out.println("\n--- Migrate Student (Change Dept) ---");
                    System.out.print("Enter Registration No of student to migrate: ");
                    int migrateRegNo = sc.nextInt();
                    sc.nextLine(); 

                    Student studentToMigrate = findStudent(studentList, currentStudentCount, migrateRegNo);

                    if (studentToMigrate != null) {
                        System.out.print("Enter new Department Name: ");
                        String newDeptName = sc.nextLine();
                        System.out.print("Enter new Department Head: ");
                        String newDeptHead = sc.nextLine();
                        
                        studentToMigrate.setDepartment(newDeptName, newDeptHead);
                        System.out.println("Student migration successful.");
                    } else {
                        System.out.println("Student with Registration No " + migrateRegNo + " not found.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- Display Student Details ---");
                    System.out.print("Enter Registration No to search: ");
                    int searchRegNo = sc.nextInt();
                    sc.nextLine(); 

                    Student foundStudent = findStudent(studentList, currentStudentCount, searchRegNo);

                    if (foundStudent != null) {
                        foundStudent.printData();
                    } else {
                        System.out.println("Student with Registration No " + searchRegNo + " not found.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        
        sc.close();
    }
}