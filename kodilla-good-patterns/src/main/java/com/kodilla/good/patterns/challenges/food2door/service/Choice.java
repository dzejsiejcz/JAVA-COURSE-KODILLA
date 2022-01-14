package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.model.Product;

public class Choice {

    private final Product product;
    private int quantity;

    public Choice(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Choice)) return false;

        Choice choice = (Choice) o;

        if (getQuantity() != choice.getQuantity()) return false;
        return getProduct().equals(choice.getProduct());
    }

    @Override
    public int hashCode() {
        int result = getProduct().hashCode();
        result = 31 * result + getQuantity();
        return result;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
