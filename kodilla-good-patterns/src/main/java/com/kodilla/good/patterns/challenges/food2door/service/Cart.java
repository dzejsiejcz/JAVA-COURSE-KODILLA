package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private final User user;
    private final Map<Shop, List<Choice>> listOfItems = new HashMap<>();

    public Cart(User user) {
        this.user = user;
    }

    public boolean addProduct(Shop shop, Choice choice) {
        if (listOfItems.containsKey(shop)) {
            listOfItems.get(shop).add(choice);
            return true;
        }
        List<Choice> oneShopList = new ArrayList<>();
        oneShopList.add(choice);
        listOfItems.put(shop, oneShopList);
        return false;
    }

    public User getUser() {
        return user;
    }

    public Map<Shop, List<Choice>> getListOfItems() {
        return listOfItems;
    }
}
