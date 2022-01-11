package com.kodilla.good.patterns.challenges.food2door.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.kodilla.good.patterns.challenges.food2door.model.User;

public class Cart {

    private final User user;
    private final List<Choice> choices = new ArrayList<>();

    public Cart(User user) {
        this.user = user;
    }

    public void addChoice(Choice newChoice) {

        Optional<Choice> existingChoiceOpt = this.choices.stream()
                .filter(choice -> choice.getProduct().equals(newChoice.getProduct()))
                .findAny();
        if (existingChoiceOpt.isPresent()) {
            Choice existingChoice = existingChoiceOpt.get();
            existingChoice.setQuantity(existingChoice.getQuantity() + newChoice.getQuantity());
        } else {
            choices.add(newChoice);
        }
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public User getUser() {
        return user;
    }

}
