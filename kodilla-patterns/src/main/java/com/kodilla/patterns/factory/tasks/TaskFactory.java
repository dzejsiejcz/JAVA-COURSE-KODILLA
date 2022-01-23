package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("The new shopping task", "laptop", 3);
            case PAINTING -> new PaintingTask("The new painting task", "red", "lamp");
            case DRIVING -> new DrivingTask("The new driving task", "city", "bike");
            default -> null;
        };
    }
}
