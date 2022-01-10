package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.information.InformationService;
import com.kodilla.good.patterns.challenges.food2door.information.MailService;
import com.kodilla.good.patterns.challenges.food2door.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.repository.SqlRepository;

public class GlutenFreeShop extends Shop{

    InformationService informationService = new MailService();
    OrderRepository orderRepository = new SqlRepository();

    public GlutenFreeShop() {
    }
}
