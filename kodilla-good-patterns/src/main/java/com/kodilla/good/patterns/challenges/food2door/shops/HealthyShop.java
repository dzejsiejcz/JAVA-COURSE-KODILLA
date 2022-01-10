package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.information.InformationService;
import com.kodilla.good.patterns.challenges.food2door.information.SmsService;
import com.kodilla.good.patterns.challenges.food2door.repository.ExcelRepository;
import com.kodilla.good.patterns.challenges.food2door.repository.OrderRepository;

public class HealthyShop extends Shop{

    InformationService informationService = new SmsService();
    OrderRepository orderRepository = new ExcelRepository();


    public HealthyShop() {
    }
}
