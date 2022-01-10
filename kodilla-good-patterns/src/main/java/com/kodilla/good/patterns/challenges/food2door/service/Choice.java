package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.model.Product;

public class Choice {

    private final Product product;
    private final int quantity;

    public Choice(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
