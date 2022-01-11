package com.kodilla.good.patterns.challenges.food2door.information;

import com.kodilla.good.patterns.challenges.food2door.model.User;

public class MailService implements InformationService {


    @Override
    public void inform(User user) {
        System.out.println(user.toString());
    }
}
