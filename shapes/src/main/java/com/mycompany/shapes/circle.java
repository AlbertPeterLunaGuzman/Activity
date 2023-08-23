package com.mycompany.shapes;
abstract class circle extends Shapes {
    private double radius;
    public circle(double radius) { this.radius = radius; }
    double calculateArea() { return Math.PI * this.radius * this.radius; }
}