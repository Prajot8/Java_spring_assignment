package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.model.Order;

public interface IOrderDAO extends JpaRepository<Order, Integer>{

}
