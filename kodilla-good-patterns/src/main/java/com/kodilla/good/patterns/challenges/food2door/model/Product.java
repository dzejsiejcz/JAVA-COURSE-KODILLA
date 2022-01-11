package com.kodilla.good.patterns.challenges.food2door.model;

public class Product {

    private String name;
    private ShopType shopType;

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

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null)
            return false;
        return shopType == product.shopType;
    }

    @Override public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (shopType != null ? shopType.hashCode() : 0);
        return result;
    }
}
