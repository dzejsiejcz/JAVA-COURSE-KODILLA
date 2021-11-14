package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class EquilateralTriangle implements Shape{

    private String name;
    private double dimmension;

    public EquilateralTriangle(String name, double dimmension) {
        this.name = name;
        this.dimmension = dimmension;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return dimmension * sqrt(3) / 4;
    }
}
