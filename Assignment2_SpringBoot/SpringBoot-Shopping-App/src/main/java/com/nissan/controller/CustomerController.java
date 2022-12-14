package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.service.ICustomerService;


@RestController
@RequestMapping("api/")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	//@Autowired
	//IOrderService orderService;
	
	//@Autowired
	//IOrderItemService orderItemService;
	@GetMapping("customers")
	public List<Customer> getAllCustomers(){
		
		return customerService.getCustomersList();
	}
	
	@PostMapping("customers")
	public Customer addNewCustomer(@RequestBody Customer _customer){
		
		return customerService.addCustomer(_customer);
	}
	
}
