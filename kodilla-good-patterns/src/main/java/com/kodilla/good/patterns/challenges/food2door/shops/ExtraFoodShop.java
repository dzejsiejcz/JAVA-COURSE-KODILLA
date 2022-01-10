package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.information.InformationService;
import com.kodilla.good.patterns.challenges.food2door.information.SmsService;
import com.kodilla.good.patterns.challenges.food2door.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.repository.SqlRepository;

public class ExtraFoodShop extends Shop {

    InformationService informationService = new SmsService();
    OrderRepository orderRepository = new SqlRepository();

    public ExtraFoodShop() {
    }
}
