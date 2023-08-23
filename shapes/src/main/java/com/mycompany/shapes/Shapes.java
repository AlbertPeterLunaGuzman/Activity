package com.mycompany.shapes;
import java.util.*;
abstract class shape { abstract double calculateArea(); }
public class Shapes {
    public static void main(String[] args) { myCircle(); myRectangle(); }
    private static double circleContent () {
        Scanner circleScanner = new Scanner (System.in);
        System.out.print("Enter the radius: ");
        double radius = circleScanner.nextDouble(); return radius;
    } 
    private static void myCircle() {
        circle circle = new circle(circleContent()) {};
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);
    }
    private static void myRectangle() {
        Scanner rectangleScanner = new Scanner (System.in);
        System.out.print("Enter the width for rectangle: ");
        double width = rectangleScanner.nextDouble();
        System.out.print("Enter the lenth for rectangle: ");
        double length = rectangleScanner.nextDouble();
        rectangle rectangle = new rectangle(width,  length) {};
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
