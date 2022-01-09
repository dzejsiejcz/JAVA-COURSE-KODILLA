package com.kodilla.good.patterns.challenges.orderService.model;

public class ProductInShoppingCart {

    private final String name;
    private final int quantity;


    public ProductInShoppingCart(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductInShoppingCart)) return false;

        ProductInShoppingCart product = (ProductInShoppingCart) o;

        if (getQuantity() != product.getQuantity()) return false;
        return getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getQuantity();
        return result;
    }

    @Override
    public String toString() {
        return "ProductInShoppingCart{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
