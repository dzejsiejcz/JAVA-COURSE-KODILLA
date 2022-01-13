package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.information.InformationService;
import com.kodilla.good.patterns.challenges.food2door.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.transport.Transport;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Shop {

    InformationService informationService;
    OrderRepository orderRepository;
    Transport transport;

    abstract public void setFields();
    abstract public String toString();


    public boolean process(User user, LocalDateTime time, List<Choice> oneShopOrder) {

            LocalDateTime deadline = time.plusDays(3L);
            boolean info = informationService.inform(user);
            boolean repo = orderRepository.createOrderRepository(user, time, oneShopOrder);
            boolean delivery = transport.prepareTransport(user, oneShopOrder, this, deadline);

            System.out.println("Successfully ordered. " + oneShopOrder + "\n");

            if (info && repo && delivery) {
                return true;
            }

            System.out.println("Order delivery failed. " + oneShopOrder + "\n");
            return false;

        }

    }


