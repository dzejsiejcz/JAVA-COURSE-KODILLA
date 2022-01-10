package com.kodilla.good.patterns.challenges.food2door.model;

import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

public class Product {

    private String name;
    private String description;
    private Shop shop;
    private String ean;
    private String unit;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Shop getShop() {
        return shop;
    }

    public String getEan() {
        return ean;
    }

    public String getUnit() {
        return unit;
    }
}
