package ASS2.SETA;

public class Q1 {

    int id;
    String name;
    String deptname;
    Double salary;
    static int count = 0;
    
    Q1(){
        this.id = 0;
        this.name = "Unknwon";
        this.deptname = "None";
        this.salary = 0.0;
        count++;
    }

    Q1(int id , String name , String deptname , Double salary){
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
    }

    static void displaycount(){
        System.out.println(("Total Object Created : " +count));
    }

    public void display() {
        System.out.println("--- Employee Details ---");
        // 'this.id' means "the id of *this* specific object"
        System.out.println("\tID: " + this.id);
        System.out.println("\tName: " + this.name);
        System.out.println("\tDepartment: " + this.deptname);
        System.out.println("\tSalary: " + this.salary);
    }

    public static void main(String[] args) {
        Q1 E1 = new  Q1(25,"shashank", "IT",55000.0);
        E1.display();
        displaycount();
        Q1 E2 = new Q1(25, "shruti", "IT", 75550.0);
        E2.display();
        displaycount();

    }
}

    
