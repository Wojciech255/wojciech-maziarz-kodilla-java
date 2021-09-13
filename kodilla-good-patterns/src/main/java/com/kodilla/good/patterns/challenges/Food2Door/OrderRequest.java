package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {

    private Provider provider;
    private Product product;

    public OrderRequest(Provider provider, Product product) {
        this.provider = provider;
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }
}
