package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.model.Product;
import com.kodilla.good.patterns.challenges.food2door.model.ShopType;
import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.service.Cart;
import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.service.PurchaseService;

public class App {

    public static void main(String[] args) {
        PurchaseService purchaseService = new PurchaseService();

        User user = new User("name", "email", "address");
        Cart cart = new Cart(user);

        Product product = new Product("bun", ShopType.HEALTHY_SHOP);
        Choice choice = new Choice(product, 2);
        cart.addChoice(choice);

        Product product2 = new Product("bun", ShopType.HEALTHY_SHOP);
        Choice choice2 = new Choice(product2, 1);
        cart.addChoice(choice2);

        purchaseService.processOrder(cart);
    }

}
