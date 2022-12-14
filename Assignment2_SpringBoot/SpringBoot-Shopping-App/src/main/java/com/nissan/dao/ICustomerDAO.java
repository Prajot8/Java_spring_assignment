package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Customer;
@Repository
public interface ICustomerDAO extends JpaRepository<Customer, Integer> {
	
	
}
