package com.sample.listlambdasort;

public class Employee {

	private int age;
	private String name;
	
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}	
}
