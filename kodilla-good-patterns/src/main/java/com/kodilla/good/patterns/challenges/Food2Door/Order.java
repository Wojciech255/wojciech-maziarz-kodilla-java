package com.kodilla.good.patterns.challenges.Food2Door;

public class Order implements OrderService{

    @Override
    public boolean buy(Provider provider, Product product) {
        System.out.println("Product was bought ! ! !");
        return true;
    }
}
