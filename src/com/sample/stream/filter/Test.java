package com.sample.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Product> products = getProducts();
		//List<Product> bookAndPriceGreaterThen100 = getProductWithBookAndPriceGreaterThen100(products);
		//System.out.println(bookAndPriceGreaterThen100);

		List<Order> orders = getOrders();
		getOrdersabc(orders);

	}

	// Find product with category Book which is price more than 100
	private static List<Product> getProductWithBookAndPriceGreaterThen100(List<Product> products) {
		return products.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equals("Book"))
				.collect(Collectors.toList());
	}

	private static void getOrdersabc(List<Order> orders) {

		List<Order> list = orders.stream()
				.filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());
		System.out.println(list);

	}

	private static List<Product> getProducts() {
		List<Product> products = Arrays.asList(new Product("Laptop", 10000, "HP"),
				new Product("Book", 110, "JavaScript"), new Product("Book", 120, "Microservice"),
				new Product("Book", 110, "Spring in Action"), new Product("Book", 80, "RDBMS"),
				new Product("Baby", 5000, "OnePlus"));
		return products;
	}

	private static List<Order> getOrders() {

		List<Product> products = Arrays.asList(new Product("Baby", 10000, "HP"), new Product("Book", 110, "JavaScript"),
				new Product("Book", 120, "Microservice"), new Product("Baby", 110, "Spring in Action"),
				new Product("Book", 80, "RDBMS"), new Product("Mobile", 5000, "OnePlus"));

		List<Product> products2 = getProducts();

		Order order = new Order();
		order.setProducts(products);

		Order order2 = new Order();
		order2.setProducts(products2);

		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		orders.add(order2);
		return orders;
	}

}
