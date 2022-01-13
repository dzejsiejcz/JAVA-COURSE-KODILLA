package com.kodilla.good.patterns.challenges.food2door.information;

import com.kodilla.good.patterns.challenges.food2door.model.User;

public class MailService implements InformationService {


    @Override
    public boolean inform(User user) {
        System.out.println("MailService sent mail about executing the order to: " + user.getName() + "\n");
        return true;
    }
}
