package com.sample.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Dinesh Kumar
 *
 */
public class GroupByTest {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		List<Employee> employees = Arrays.asList(new Employee(1000, "TL"), new Employee(2000, "TL"),
				new Employee(1500, "ML"), new Employee(6000, "TL"), new Employee(3000, "TL"), new Employee(5000, "PM"),
				new Employee(9000, "PM"));

		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		System.out.println(map);
	}

	public Map<String, Long> getCountOfString(List<String> items) {

		return items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
