package com.kodilla.good.patterns.challenges.Food2Door;

public class App {
    public static void main(String[] args) {
        Provider provider = new Provider("John","Rambo","JohnRambo@gmail.com");
        Product product = new Product("apples",5);
        OrderRequest orderRequest = new OrderRequest(provider, product);
        ProductOrderService productOrderService = new ProductOrderService(new EmailInfo(), new Order(), new RepoToDataBase());
        productOrderService.process(orderRequest);
    }
}
