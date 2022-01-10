package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Purchase {

    private final LocalDateTime orderTime;
    private final Cart cart;

    public Purchase(Cart cart) {
        this.cart = cart;
        this.orderTime = LocalDateTime.now();
    }


    public boolean sendOrder(){
        boolean response = true;
        for ( Map.Entry<Shop, List<Choice>> entry : cart.getCart().entrySet() ) {
            boolean result = entry.getKey().process(cart.getUser(), orderTime, entry.getValue());
            if (!result) {
                response = false;
            }
        }
        return response;
    }




}
