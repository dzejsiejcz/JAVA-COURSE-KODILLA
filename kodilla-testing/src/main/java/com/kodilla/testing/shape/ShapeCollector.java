package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    public boolean removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int shapeNumber) {
        if (shapeNumber >= 0 && shapeNumber < shapes.size()){
            return shapes.get(shapeNumber);
        }
        return null;
    }

    public String showFigures(){
        StringBuilder names = new StringBuilder(shapes.size());
        for (Shape shape : shapes) {
            names.append(shape.getClass().getSimpleName()).append(": ").append(shape.getShapeName()).append(", ");
        }
        return names.toString();
    }
}
