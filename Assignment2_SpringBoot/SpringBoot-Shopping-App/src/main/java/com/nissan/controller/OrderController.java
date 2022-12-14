package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Order;
import com.nissan.service.IOrderService;

@RestController
@RequestMapping("api/")
public class OrderController {
	@Autowired
	IOrderService orderService;
	
	@GetMapping("orders")
	public List<Order> getAllOrders(){
		return orderService.getOrders();
	}
	
	@PostMapping("orders")
	public Order addOrder(@RequestBody Order _order){
		return orderService.addOrder(_order);
	}
}
