package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TasksLists {

    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TasksLists(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksLists tasksLists = (TasksLists) o;
        return Objects.equals(name, tasksLists.name) &&
                Objects.equals(tasks, tasksLists.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }
}