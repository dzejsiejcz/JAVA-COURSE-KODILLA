package com.kodilla.good.patterns.challenges.food2door.repository;

import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.model.User;

import java.time.LocalDateTime;
import java.util.List;

public class SqlRepository implements OrderRepository {

    @Override
    public boolean createOrderRepository(User user, LocalDateTime time, List<Choice> choiceList) {
        System.out.println("The order for "  + user.getName() + " time " + time + " with: " + choiceList + " is written in SQLite3 \n");


        return true;
    }
}
