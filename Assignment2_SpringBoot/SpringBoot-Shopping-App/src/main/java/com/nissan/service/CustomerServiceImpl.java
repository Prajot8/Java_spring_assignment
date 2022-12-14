package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ICustomerDAO;
import com.nissan.model.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDAO customerDao;
	
	@Override
	public List<Customer> getCustomersList() {
		
		return customerDao.findAll();
	}

	@Override
	@Transactional
	public Customer addCustomer(Customer _customer) {
		
		return customerDao.save(_customer);
	}

}
