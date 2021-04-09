package com.kodilla.good.patterns.challenges.miniebay;

public class Order implements OrderService {
    @Override
    public boolean buy(User user, Product product) {
        System.out.println("Produkt zostal kupiony");
        return true;
    }
}
