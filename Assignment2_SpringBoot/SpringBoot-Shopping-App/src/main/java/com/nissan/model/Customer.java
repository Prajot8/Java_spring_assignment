package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcustomer")
public class Customer {
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer custNo;
	@Column(nullable=false)
	private String custName;
	private String address;
	//default constructor
	public Customer() {
		
	}
	
	//parametrized constructor
	public Customer(Integer custNo, String custName, String address) {
		
		this.custNo = custNo;
		this.custName = custName;
		this.address = address;
	}

	//getters & setters
	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//override toString()
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", address=" + address + "]";
	}
	
	
	
}
