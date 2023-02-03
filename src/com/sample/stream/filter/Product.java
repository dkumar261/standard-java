package com.sample.stream.filter;

public class Product {
	private String category;
	private int price;
	private String name;

	public Product(String category, int price, String name) {
		this.category = category;
		this.price = price;
		this.name = name; 
	}

	
	public Product withProduct(int newPrice) {
		this.price=newPrice;
		return this;
	}
	
	@Override
	public String toString() {
		return "Product [category=" + category + ", price=" + price + ", name=" + name + "]";
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
