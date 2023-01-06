package com.sample.stream.filter;

import java.util.List;

public class Order {

	private List<Product> products;
	
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
}
