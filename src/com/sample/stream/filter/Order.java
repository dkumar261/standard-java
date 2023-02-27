package com.sample.stream.filter;

import java.util.List;

public class Order {

	private List<Product> products;
	
	private Customer customer;
	
	@Override
	public String toString() {
		return "Order [products=" + products + "]";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
