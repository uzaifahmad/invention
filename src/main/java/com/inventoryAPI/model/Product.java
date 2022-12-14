	package com.inventoryAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer inventoryId;
	private String productId;
	private int quantity;
	private Product(Integer inventoryId, String productId, int quantity) {
		super();
		this.inventoryId = inventoryId;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public Product() {
	}
	
	
	public Integer getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
