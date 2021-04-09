package com.kodilla.good.patterns.challenges.miniebay;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService rentalService,
                               final OrderRepository rentalRepository) {
        this.informationService = informationService;
        this.orderService = rentalService;
        this.orderRepository = rentalRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.buy(orderRequest.getUser(), orderRequest.getProduct());
        if (isBought) {
            informationService.inform(orderRequest.getUser().getEmail());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
