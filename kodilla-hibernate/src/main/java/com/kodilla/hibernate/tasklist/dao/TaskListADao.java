package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskListA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListADao extends CrudRepository<TaskListA, Integer> {

    List<TaskListA> findByListName(String listName);



}
