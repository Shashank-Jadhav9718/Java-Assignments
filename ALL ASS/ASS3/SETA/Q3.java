package ASS3.SETA;

import java.util.Scanner;

interface Operation {
    final double PI = 3.142;
    void area();
    void volume();
}

class Cylinder implements Operation {
    
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void area() {
        double r = this.radius;
        double h = this.height;
        double cylinderArea = (2 * PI * r * r) + (2 * PI * r * h);
        System.out.println("Area of Cylinder: " + cylinderArea);
    }

    @Override
    public void volume() {
        double r = this.radius;
        double h = this.height;
        double cylinderVolume = PI * r * r * h;
        System.out.println("Volume of Cylinder: " + cylinderVolume);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double h = sc.nextDouble();

        Cylinder myCylinder = new Cylinder(r, h);

        myCylinder.area();
        myCylinder.volume();
        
        sc.close();
    }
}