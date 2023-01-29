package com.sample.stream.filter;

public class Employee {

	private int salary;
	private String designation;

	public Employee(int salary,String designation) {
		this.salary = salary;
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + "]";
	}
	
	
}
