package com.kodilla.good.patterns.challenges.Food2Door;

public class RepoToDataBase implements OrderRepository{
    @Override
    public boolean createOrder(Provider provider, Product product) {
        System.out.println("Save to Data Base !!!");
        return true;
    }
}
