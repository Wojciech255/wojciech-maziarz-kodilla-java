package com.kodilla.good.patterns.challenges.Food2Door;

public class EmailInfo implements InfoService{
    @Override
    public void info(String email) {
        System.out.println("E-mail was sent to :" + email);
    }
}
