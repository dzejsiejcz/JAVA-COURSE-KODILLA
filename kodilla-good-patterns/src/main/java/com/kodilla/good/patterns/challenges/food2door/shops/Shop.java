package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.service.OrderService;
import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.information.InformationService;
import com.kodilla.good.patterns.challenges.food2door.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.transport.Transport;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Shop {

    protected OrderService orderService = new OrderService();
    protected InformationService informationService;
    protected OrderRepository orderRepository;
    protected Transport transport;

    public boolean process(User user, LocalDateTime time, List<Choice> oneShopOrder) {
        boolean isOrdered = orderService.createOrder(user, time, oneShopOrder);

        if (isOrdered) {
            LocalDateTime deadline = time.plusDays(3L);
            informationService.inform(user);
            orderRepository.createOrderRepository(user, time, oneShopOrder);
            transport.inform(user, oneShopOrder,deadline);
            System.out.println("Successfully ordered. " + oneShopOrder);
            return true;
        } else {
            System.out.println("Not ordered. " + oneShopOrder);
            return false;
        }
    }

}
