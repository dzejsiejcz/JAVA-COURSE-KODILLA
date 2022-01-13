package com.kodilla.good.patterns.challenges.food2door.model;

import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

public class Product {

    private final String name;
    private final ShopType shopType;

    public Product(String name, ShopType shopType) {
        this.name = name;
        this.shopType = shopType;
    }

    public String getName() {
        return name;
    }

    public ShopType getShopType() {
        return shopType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!getName().equals(product.getName())) return false;
        return getShopType() == product.getShopType();
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getShopType().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", shopType=" + shopType +
                '}';
    }
}
