package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="tblorder")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderNo;
	
	
	private Integer custNo;
	
	private LocalDate orderDate;
	
	@ManyToOne	//many Order one Customer
	@JoinColumn(name="custNo",insertable = false,updatable = false)
	private Customer customer;

	public Order() {
		
	}

	public Order(Integer orderNo, Integer custNo, LocalDate orderDate, Customer customer) {
		
		this.orderNo = orderNo;
		this.custNo = custNo;
		this.orderDate = orderDate;
		this.customer = customer;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", custNo=" + custNo + ", orderDate=" + orderDate + ", customer="
				+ customer + "]";
	}
	
	
	
}
