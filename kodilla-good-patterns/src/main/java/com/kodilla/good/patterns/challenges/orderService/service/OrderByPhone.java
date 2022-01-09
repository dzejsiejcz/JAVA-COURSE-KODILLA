package com.kodilla.good.patterns.challenges.orderService.service;

import com.kodilla.good.patterns.challenges.orderService.model.ProductInShoppingCart;
import com.kodilla.good.patterns.challenges.orderService.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderByPhone implements OrderService{
    @Override
    public boolean createOrder(User user, LocalDateTime time, Map<Integer, ProductInShoppingCart> items) {
        return false;
    }
}
