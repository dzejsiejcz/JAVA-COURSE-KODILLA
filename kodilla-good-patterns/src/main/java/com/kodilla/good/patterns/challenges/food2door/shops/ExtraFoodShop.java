package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.information.MailService;
import com.kodilla.good.patterns.challenges.food2door.repository.SqlRepository;
import com.kodilla.good.patterns.challenges.food2door.transport.BikeTransport;


public class ExtraFoodShop extends Shop {

    @Override
    public void setFields() {
        this.informationService = new MailService();
        this.orderRepository = new SqlRepository();
        this.transport = new BikeTransport();
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }




}
