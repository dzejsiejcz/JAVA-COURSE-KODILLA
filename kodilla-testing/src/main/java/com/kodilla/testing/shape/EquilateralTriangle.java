package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class EquilateralTriangle implements Shape{

    private String name;

    public EquilateralTriangle(String name) {
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField(double a) {
        return a * sqrt(3) / 4;
    }
}
