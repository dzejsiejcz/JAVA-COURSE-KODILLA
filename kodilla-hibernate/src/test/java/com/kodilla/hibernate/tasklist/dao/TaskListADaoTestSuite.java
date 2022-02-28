package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskListA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListADaoTestSuite {

    @Autowired
    private TaskListADao taskListADao;
    private static final String LIST_NAME = "Name of list";
    private static final String DESCRIPTION = "Test: Task about hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskListA taskList = new TaskListA(LIST_NAME, DESCRIPTION);

        //When
        taskListADao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskListA> readTaskList = taskListADao.findById(id);
        assertTrue(readTaskList.isPresent());

        //CleanUp
        taskListADao.deleteById(id);
    }

}
