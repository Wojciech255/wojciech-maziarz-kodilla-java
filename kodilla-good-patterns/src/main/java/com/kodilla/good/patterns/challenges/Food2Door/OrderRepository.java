package com.kodilla.good.patterns.challenges.Food2Door;

public interface OrderRepository {
    boolean createOrder(final Provider provider, final Product product);
}
