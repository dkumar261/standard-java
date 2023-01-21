package com.sample.stream.filter;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(2000), new Employee(4000), new Employee(6000),
				new Employee(7000), new Employee(8000));

		int sum = employees.stream().mapToInt(emp -> emp.getSalary()).sum();
		
		System.out.println(sum);
	}
}
