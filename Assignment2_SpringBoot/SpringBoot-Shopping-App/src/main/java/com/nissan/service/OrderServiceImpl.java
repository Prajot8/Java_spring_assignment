package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IOrderDAO;
import com.nissan.model.Order;
@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	IOrderDAO orderDao;
	
	@Override
	public List<Order> getOrders() {
		
		return orderDao.findAll();
	}

	@Override
	@Transactional
	public Order addOrder(Order _order) {
		
		return orderDao.save(_order);
	}

}
