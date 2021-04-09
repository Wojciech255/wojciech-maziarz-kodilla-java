package com.kodilla.good.patterns.challenges.miniebay;

public class RepoToTxt implements OrderRepository {

    @Override
    public boolean createOrder(User user,Product product) {
        System.out.println("Zapis do pliku txt");
        return true;
    }
}
