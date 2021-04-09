package com.kodilla.good.patterns.challenges.miniebay;

public class EmailInfo implements InformationService{
    @Override
    public void inform(String email) {
        System.out.println("Email zostal wyslany do : " + email);
    }
}
