package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderService {

    private InfoService infoService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InfoService infoService, OrderService orderService, OrderRepository orderRepository) {
        this.infoService = infoService ;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.buy(orderRequest.getProvider(), orderRequest.getProduct());
        if (isBought) {
            infoService.info(orderRequest.getProvider().getEmail());
            orderRepository.createOrder(orderRequest.getProvider(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProvider(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getProvider(), orderRequest.getProduct(), false);
        }
    }
}
