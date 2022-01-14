package com.kodilla.good.patterns.challenges.food2door.information;

import com.kodilla.good.patterns.challenges.food2door.model.User;

public class SmsService implements InformationService {
    @Override
    public boolean inform(User user) {
        System.out.println("SMSService sent message to: " + user.getName()+ "\n");
        return true;
    }
}
