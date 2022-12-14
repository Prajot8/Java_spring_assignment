package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.model.OrderItem;

public interface IOrderItemDAO extends JpaRepository<OrderItem, Integer> {

}
