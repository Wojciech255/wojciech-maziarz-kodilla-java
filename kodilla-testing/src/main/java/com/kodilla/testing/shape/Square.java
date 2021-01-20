package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;

    public Square(double side) {
        this.shapeName = "Square";
        this.field = side * side;

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
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}

