package com.sample.listlambdasort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee mike =  new Employee(23, "mike");
		Employee john =  new Employee(50, "john");
		Employee bob =  new Employee(40, "bob");
		Employee smith =  new Employee(21, "smith");
		
		List<Employee> employees = Arrays.asList(mike,john,bob,smith);
		
		System.out.println(employees);
		Collections.sort(employees, (e1,e2) -> e1.getAge().compareTo(e2.getAge()));
		System.out.println(employees);
	}
}
