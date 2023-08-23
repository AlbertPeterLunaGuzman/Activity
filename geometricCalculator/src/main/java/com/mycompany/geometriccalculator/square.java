package com.mycompany.geometriccalculator;
public class square implements GeometricShape {
    double side;
    public square(double side) { this.side = side; }
    @Override public double calculateArea() { return this.side * this.side; }
    @Override public double calculatePerimeter() { return 4 * this.side; }
    @Override public void displayInfo() { 
        System.out.println("Area of the Square: " + calculateArea() +
                           "\nPerimeter of the Square: " + calculatePerimeter());
    }
}
