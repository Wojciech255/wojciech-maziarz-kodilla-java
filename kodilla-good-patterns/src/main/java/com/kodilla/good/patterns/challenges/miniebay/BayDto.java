package com.kodilla.good.patterns.challenges.miniebay;

public class BayDto {

    public User user;
    public boolean isBought;

    public BayDto(final User user, final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }


}
