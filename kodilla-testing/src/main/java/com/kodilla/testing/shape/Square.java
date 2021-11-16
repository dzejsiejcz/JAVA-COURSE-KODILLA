package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String NAME = "Square";
    private double dimension;

    public Square(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return dimension * dimension;
    }
}
