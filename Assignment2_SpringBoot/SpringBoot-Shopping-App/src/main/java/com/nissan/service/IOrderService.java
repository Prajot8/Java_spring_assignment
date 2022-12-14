package com.nissan.service;

import java.util.List;

import com.nissan.model.Order;

public interface IOrderService {

	List<Order> getOrders();

	Order addOrder(Order _order);

}
