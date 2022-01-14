package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Cart {

    private final User user;
    private final List<Choice> listOfChoices = new ArrayList<>();

    public Cart(User user) {
        this.user = user;
    }

    public void addChoice(Choice nextChoice) {
        Optional<Choice> existingChoiceOptional = this.listOfChoices.stream()
                .filter(choice -> choice.getProduct().equals(nextChoice.getProduct()))
                .findAny();
        if (existingChoiceOptional.isPresent()) {
            Choice existingChoice = existingChoiceOptional.get();
            existingChoice.setQuantity(existingChoice.getQuantity() + nextChoice.getQuantity());
        } else {
            listOfChoices.add(nextChoice);
        }
    }

    public User getUser() {
        return user;
    }

    public List<Choice> getListOfChoices() {
        return listOfChoices;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", listOfChoices=" + listOfChoices +
                '}';
    }
}
