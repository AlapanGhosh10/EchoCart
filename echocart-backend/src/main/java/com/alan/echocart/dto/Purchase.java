package com.alan.echocart.dto;

import java.util.Set;

public record Purchase(
         Customer customer,
         Address shippingAddress,
         Address billingAddress,
         Order order,
         Set<OrderItem>orderItems
) {
}
