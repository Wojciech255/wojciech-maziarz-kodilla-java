package com.kodilla.testing.shape;

public class Circle implements Shape{
    String shapeName;
    double field;

    public Circle(double field) {
        this.shapeName = "Circle";
        double radius = 0;
        this.field = Math.PI*radius*radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}

