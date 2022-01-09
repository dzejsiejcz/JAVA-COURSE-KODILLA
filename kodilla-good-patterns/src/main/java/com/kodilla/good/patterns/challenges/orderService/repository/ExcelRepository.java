package com.kodilla.good.patterns.challenges.orderService.repository;

import com.kodilla.good.patterns.challenges.orderService.model.ProductInShoppingCart;
import com.kodilla.good.patterns.challenges.orderService.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public class ExcelRepository implements OrderRepository{
    @Override
    public boolean createOrderRepository(User user, LocalDateTime time, Map<Integer, ProductInShoppingCart> items) {
        return false;
    }
}
