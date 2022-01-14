package com.kodilla.good.patterns.challenges.food2door.transport;

import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

import java.time.LocalDateTime;
import java.util.List;

public class CarTransport implements Transport{
    @Override
    public boolean prepareTransport(User user, List<Choice> choiceList, Shop shop, LocalDateTime deadline) {
        System.out.println(choiceList + "is for deliver by CarTeam until: " + deadline + " for " + user.toString() + "\n");
        return true;
    }
}
