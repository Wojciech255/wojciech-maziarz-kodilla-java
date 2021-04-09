package com.kodilla.good.patterns.challenges.miniebay;

public interface OrderRepository {
    boolean createOrder(final User user, final Product product);
}