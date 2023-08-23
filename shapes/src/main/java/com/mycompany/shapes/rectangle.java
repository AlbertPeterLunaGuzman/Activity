package com.mycompany.shapes;
abstract class rectangle {
    private double width;   private double length;
    public rectangle(double width, double length) { this.width = width; this.length = length; }
    double calculateArea() { return width * length; }
}
