package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

    private Provider provider;
    private Product product;
    private boolean isBought;

    public OrderDto(final Provider provider,final Product product,final boolean isBought) {
        this.provider = provider;
        this.product = product;
        this.isBought = isBought;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isBought() {
        return isBought;
    }
}
