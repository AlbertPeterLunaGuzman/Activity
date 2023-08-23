package com.mycompany.geometriccalculator;
public class triangle implements GeometricShape {
    double height, base, side, side2;
    public triangle(double height, double base, double side1, double side2) {
        this.height = height; this.side = base; this.base = side1; this.side2 = side2;
    }
    @Override public double calculateArea() { return (base * height) / 2; }
    @Override public double calculatePerimeter() { return this.base + this.side + this.side2; }
    @Override public void displayInfo() { System.out.println("Area of the triangle: " + calculateArea() + 
                                          "\nPerimeter of the triangle: " + calculatePerimeter());}
}
