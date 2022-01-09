package com.kodilla.good.patterns.challenges.orderService.service;

import com.kodilla.good.patterns.challenges.orderService.model.ProductInShoppingCart;
import com.kodilla.good.patterns.challenges.orderService.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public interface OrderService {

    boolean createOrder(User user, LocalDateTime time, Map<Integer, ProductInShoppingCart> items);

}
