package com.kodilla.good.patterns.challenges.orderService;

import com.kodilla.good.patterns.challenges.orderService.information.MailService;
import com.kodilla.good.patterns.challenges.orderService.process.OrderingProcessor;
import com.kodilla.good.patterns.challenges.orderService.repository.SqlRepository;
import com.kodilla.good.patterns.challenges.orderService.request.OrderRequest;
import com.kodilla.good.patterns.challenges.orderService.request.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.orderService.service.OrderOnline;


public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderingProcessor orderingProcessor = new OrderingProcessor(new MailService(), new OrderOnline(), new SqlRepository());
        orderingProcessor.process(orderRequest);
    }
}
