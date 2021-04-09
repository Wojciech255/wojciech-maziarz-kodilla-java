package com.kodilla.good.patterns.challenges.miniebay;

public class Application {
    public static void main(String[] args) {
        User user = new User("John", "Connor", "JohnConnor@gmail.com");
        Product product = new Product("TV");
        OrderRequest orderRequest = new OrderRequest(user, product);
        ProductOrderService productOrderService = new ProductOrderService(new EmailInfo(), new Order(), new RepoToTxt());
        productOrderService.process(orderRequest);
    }
}