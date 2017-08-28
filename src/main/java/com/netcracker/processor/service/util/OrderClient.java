package com.netcracker.processor.service.util;

import com.netcracker.processor.domain.Order;
import com.netcracker.processor.domain.OrderItem;
import com.netcracker.processor.service.impl.exception.OrderAlreadyPaidException;
import com.netcracker.processor.service.impl.exception.OrderItemNotFoundException;
import com.netcracker.processor.service.impl.exception.OrderNotFoundException;

import java.util.List;
import java.util.Map;

/**
 * Created by ulza1116 on 8/22/2017.
 */
public interface OrderClient {
    List<Order> getOrders(String stringUri, Map<String, String> params);

    void payForOrder(String stringUri, int orderId) throws OrderAlreadyPaidException, OrderNotFoundException;

    int getOrderCount(String stringUri, Map<String, String> params);

    double getTotalPrice(String stringUri, Map<String, String> params);

    Order getOrder(String stringUri);

    Order createOrder(String stringUri, Order order);

    OrderItem createOrderItem(String stringUri, OrderItem orderItem);

    void deleteOrderItem(String stringUri) throws OrderItemNotFoundException;
}
