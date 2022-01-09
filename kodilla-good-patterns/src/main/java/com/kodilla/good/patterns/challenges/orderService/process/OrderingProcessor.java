package com.kodilla.good.patterns.challenges.orderService.process;

import com.kodilla.good.patterns.challenges.orderService.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.orderService.information.InformationService;
import com.kodilla.good.patterns.challenges.orderService.request.OrderRequest;
import com.kodilla.good.patterns.challenges.orderService.service.OrderService;

public class OrderingProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderingProcessor(final InformationService informationService,
                             final OrderService orderService, final OrderRepository orderRepository) {

        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getTime(), orderRequest.getItems());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrderRepository(orderRequest.getUser(), orderRequest.getTime(), orderRequest.getItems());
            System.out.println("Successfully ordered. " + orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Not ordered. " + orderRequest);
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
