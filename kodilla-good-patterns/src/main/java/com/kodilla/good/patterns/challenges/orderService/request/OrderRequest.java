package com.kodilla.good.patterns.challenges.orderService.request;

import com.kodilla.good.patterns.challenges.orderService.model.ProductInShoppingCart;
import com.kodilla.good.patterns.challenges.orderService.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequest {

    private final User user;
    private final LocalDateTime time;
    private final Map<Integer, ProductInShoppingCart> items;

    public OrderRequest(User user, LocalDateTime time, Map<Integer, ProductInShoppingCart> items) {
        this.user = user;
        this.time = time;
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Map<Integer, ProductInShoppingCart> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", time=" + time +
                ", items=" + items +
                '}';
    }
}
