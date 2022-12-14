package com.nissan.service;

import java.util.List;

import com.nissan.model.Customer;

public interface ICustomerService {

	List<Customer> getCustomersList();

	Customer addCustomer(Customer _customer);


}
