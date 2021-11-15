package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{

    private static final String NAME = "Triangle";
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return side * height / 2;
    }
}
