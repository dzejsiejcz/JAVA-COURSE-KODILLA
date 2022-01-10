package com.kodilla.good.patterns.challenges.food2door.transport;

import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.service.Choice;

import java.time.LocalDateTime;
import java.util.List;

public interface Transport {

    void inform(User user, List<Choice> choiceList, LocalDateTime deadline);
}
