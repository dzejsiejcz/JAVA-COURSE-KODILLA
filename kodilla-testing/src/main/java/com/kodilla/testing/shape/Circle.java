package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField(double r) {
        return r*r*Math.PI;
    }
}
