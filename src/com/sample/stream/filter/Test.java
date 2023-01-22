package com.sample.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Product> orders = getProductWithCustomerTier2(getOrders());
		System.out.println(orders);
	}

	// Ex-1 Find product with category Book which is price more than 100
	private static List<Product> getProductWithBookAndPriceGreaterThen100(List<Product> products) {
		return products.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equals("Book"))
				.collect(Collectors.toList());
	}
	// Ex-1 Find product with category Book which is price more than 100 with double filter
	private static List<Product> getProductWithBookAndPriceGreaterThen100WithFilter(List<Product> products) {
		return products.stream().filter(product -> product.getPrice() > 100).filter(product -> product.getCategory().equals("Book")).collect(Collectors.toList());
	}

	
	// Exercise 2 — Obtain a list of order with products belong to category “Baby”
	private static List<Product> getProductWithBaby(List<Product> products) {
		return products.stream().filter(product -> product.getCategory().equals("Baby")).collect(Collectors.toList());
	}

	// Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
	private static List<Product> getProductWithToyAnd10PercentDiscount(List<Product> products) {
		return products.stream().filter(product -> product.getCategory().equals("Toy"))
				.map(product -> product.withProduct(product.getPrice()/2)).collect(Collectors.toList());
	}

	// Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
	private static List<Product> getProductWithCustomerTier2(List<Order> orders) {

		List<Product> productList = orders.stream().filter(order -> order.getCustomer().getTier()==2).flatMap(o -> o.getProducts().stream())
		.collect(Collectors.toList());
		return productList;
	
	}
	
	

//		private static List<Product> getProductWithBookAndPriceGreaterTenPercentDiscount(List<Product> products) {
//			return products.stream().filter(product -> product.getCategory().equals("Book")).map(product -> product.getPrice()*0.9))
//					.collect(Collectors.toList());
//		}

	private static List<Product> getProductWithBookAndPriceGreaterTenPercentDiscount(List<Product> products) {
		return products.stream().filter(product -> product.getCategory().equals("Book")).collect(Collectors.toList());
	}

	private static void getOrdersabc(List<Order> orders) {

		List<Order> list = orders.stream()
				.filter(order -> order.getProducts().stream()
						.anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	private static List<Product> getProducts() {
		List<Product> products = Arrays.asList(
				new Product("Laptop", 10000, "HP"),
				new Product("Book", 110, "JavaScript"), 
				new Product("Book", 120, "Microservice"),
				new Product("Book", 110, "Spring in Action"), 
				new Product("Book", 80, "RDBMS"),
				new Product("Ram", 1800, "Samsung"),
				new Product("Book", 800, "HTML"),
				new Product("Baby", 800, "Toy"),
				new Product("Toy", 8200, "Toy-Elephant"),
				new Product("Toy", 8100, "Toy-Tiger"),
				new Product("Toy", 8300, "Toy-Fish"),
				new Product("Mobile", 500, "OnePlus"));
		
		return products;
	}

	private static List<Order> getOrders() {

		List<Product> products = Arrays.asList(
				new Product("Laptop", 10000, "HP"),
				new Product("Book", 110, "JavaScript"),
				new Product("Book", 120, "Microservice"), 
				new Product("Baby", 110, "Spring in Action"),
				new Product("Book", 80, "RDBMS"),
				new Product("Mouse", 180, "RDBMS"),
				new Product("keyboard", 80, "RDBMS"),
				new Product("Mobile", 5000, "OnePlus"));

		List<Product> products2 = getProducts();
		Order order = new Order();
		order.setProducts(products);
		order.setCustomer(new Customer(10L,"Dinesh",2));
		
		Order order2 = new Order();
		order2.setProducts(products2);
		order2.setCustomer(new Customer(10L,"Mike",4));
		
		List<Order> orders = new ArrayList<Order>();
		
		orders.add(order);
		orders.add(order2);
		return orders;
	}

	public Customer customers() {
		Customer customer = new Customer(10L,"Dinesh",2);
		return customer;
	}
	public int getEmployeesSalarySum(List<Employee> employees) {
		Arrays.asList(new Employee(2000), new Employee(4000), new Employee(6000), new Employee(7000),
				new Employee(8000));
		int sum = employees.stream().mapToInt(emp -> emp.getSalary()).sum();
		return sum;
	}

}
