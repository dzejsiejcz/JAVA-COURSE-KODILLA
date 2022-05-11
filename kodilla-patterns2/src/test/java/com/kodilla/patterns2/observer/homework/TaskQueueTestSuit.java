package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuit {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue student1 = new TaskQueue("student1");
        TaskQueue student2 = new TaskQueue("student2");

        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);

        //When
        student1.addTask("Decorator");
        student2.addTask("Decorator");
        student2.addTask("Builder");
        student1.addTask("Adapter");
        student2.addTask("Singleton");

        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}
