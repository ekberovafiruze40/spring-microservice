package com.example.order_service.service.impl;

import com.example.order_service.client.UserClient;
import com.example.order_service.dto.OrderRequest;
import com.example.order_service.dto.OrderResponse;
import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepository;
import com.example.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserClient userClient;

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {

        try {
            userClient.getUserById(orderRequest.getUserId());
        } catch (feign.FeignException e) {
            System.err.println("Feign Xətası: " + e.status() + " - " + e.getMessage());
            throw new RuntimeException("User-Service cavab vermir və ya User yoxdur.");
        }

        Order order = new Order();
        order.setProductName(orderRequest.getProductName());
        order.setPrice(orderRequest.getPrice());
        order.setUserId(orderRequest.getUserId());

        Order saveOrder = orderRepository.save(order);

        return new OrderResponse(
                saveOrder.getId(),
                saveOrder.getProductName(),
                saveOrder.getPrice(),
                saveOrder.getUserId()
        );
    }
}
