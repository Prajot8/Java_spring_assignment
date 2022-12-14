package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IOrderItemDAO;
import com.nissan.model.OrderItem;
@Service
public class OrderItemServiceImpl implements IOrderItemService {

	@Autowired
	IOrderItemDAO orderItemDao;
	
	@Override
	public List<OrderItem> getOrderItems() {
		
		return orderItemDao.findAll();
	}

	@Override
	@Transactional
	public OrderItem addOrderItem(OrderItem _orderItem) {
		
		return orderItemDao.save(_orderItem);
	}
	
}
