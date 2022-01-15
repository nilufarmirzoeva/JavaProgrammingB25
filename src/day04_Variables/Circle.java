package day04_Variables;

public class Circle {
    /*
3.Create a class named Circle, write a program that can calculate
the area & perimeter of any given Circle
 */
    public static void main(String[] args) {
        // PI,radius,diameter,area,perimeter


        double PI = 3.14;
        double radius = 10;
        double diameter=radius *2;

        double area = PI * radius * radius;// finds the diameter by multiplying the radius
        double perimeter = 2 * radius * PI;


        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }

}
