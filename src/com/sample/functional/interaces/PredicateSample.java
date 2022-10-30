package com.sample.functional.interaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Product {
	private String category;
	private int price;
	private String name;

	public Product(String category, int price, String name) {
		this.category = category;
		this.price = price;
		this.name = name;
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
}

class Demo<T> implements Predicate<T> {

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		return false;
	}

}

public class PredicateSample {

	public static void main(String[] args) {

		Predicate<Product> pd = new Predicate<Product>() {

			@Override
			public boolean test(Product t) {
				boolean pr = t.getCategory().equals("Book") && t.getPrice() > 100;
				return pr;
			}
		};
		
		pd.test(new Product("Book", 100, "abc"));
	}
}
