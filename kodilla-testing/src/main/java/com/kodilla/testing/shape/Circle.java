package com.kodilla.testing.shape;

public class Circle implements Shape{

    private static final String NAME = "Circle";
    private double dimmension;

    public Circle(double dimmension) {
        this.dimmension = dimmension;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return dimmension*dimmension*Math.PI;
    }
}
