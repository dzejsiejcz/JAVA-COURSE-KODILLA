package com.kodilla.good.patterns.challenges.orderService.process;

import com.kodilla.good.patterns.challenges.orderService.model.User;

public class OrderDto {

    private final User user;
    private final boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
