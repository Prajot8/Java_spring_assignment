package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Order;
import com.nissan.model.OrderItem;
import com.nissan.service.IOrderItemService;

@RestController
@RequestMapping("api/")
public class OrderItemController {
	
	@Autowired
	IOrderItemService orderItemService;
	
	@GetMapping("orderitems")
	public List<OrderItem> getAllOrderItems(){
		return orderItemService.getOrderItems();
	}
	
	@PostMapping("orderitems")
	public OrderItem addNewOrderItem(@RequestBody OrderItem _orderItem){
		return orderItemService.addOrderItem(_orderItem);
	}
}
