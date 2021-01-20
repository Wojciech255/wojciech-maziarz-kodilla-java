package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    double field;

    public Triangle(double side, double height) {
        this.shapeName = "Triangle";
        this.field = 0.5 * side * height;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}