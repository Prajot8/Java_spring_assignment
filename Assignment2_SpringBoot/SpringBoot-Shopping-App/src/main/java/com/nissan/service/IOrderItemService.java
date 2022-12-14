package com.nissan.service;

import java.util.List;

import com.nissan.model.Order;
import com.nissan.model.OrderItem;

public interface IOrderItemService {

	List<OrderItem> getOrderItems();

	OrderItem addOrderItem(OrderItem _orderItem);
	
}
