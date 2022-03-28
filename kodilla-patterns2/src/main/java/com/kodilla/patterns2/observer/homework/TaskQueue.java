package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements ObservableTasks {
    private final List<ObserverTask> observers;
    private final List<String> tasks;
    private final String studentName;

    public TaskQueue(String studentName) {
        this.studentName = studentName;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public void registerObserver(ObserverTask observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverTask observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverTask observer) {
        observers.remove(observer);
    }
}
