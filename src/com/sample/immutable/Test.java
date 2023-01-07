package com.sample.immutable;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Address> addresses = new ArrayList<>();
		Address delhi = new Address();
		delhi.setCity("Delhi");
		addresses.add(delhi );
		Employee employee = new Employee(addresses );
		
		employee.getAddresses().add(null);
	}
}
