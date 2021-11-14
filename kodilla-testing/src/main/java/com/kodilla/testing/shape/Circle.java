package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name;
    private double dimmension;

    public Circle(String name, double dimmension) {
        this.name = name;
        this.dimmension = dimmension;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return dimmension*dimmension*Math.PI;
    }
}
