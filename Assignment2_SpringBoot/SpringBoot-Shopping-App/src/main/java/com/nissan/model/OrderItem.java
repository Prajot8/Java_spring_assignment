package com.nissan.model;

import javax.persistence.*;

@Entity
@Table(name="tblorderitem")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer itemId;
	private Integer orderNo;
	private String itemName;
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="orderNo",insertable = false,updatable = false)
	private Order order;

	public OrderItem() {
		
	}

	public OrderItem(Integer itemId, Integer orderNo, String itemName, Integer quantity, Order order) {
		
		this.itemId = itemId;
		this.orderNo = orderNo;
		this.itemName = itemName;
		this.quantity = quantity;
		this.order = order;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", orderNo=" + orderNo + ", itemName=" + itemName + ", quantity="
				+ quantity + ", order=" + order + "]";
	}
	
	
	
	
}
