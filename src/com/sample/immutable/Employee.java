package com.sample.immutable;

import java.util.Collections;
import java.util.List;

public class Employee {

	private List<Address> addresses;

	public Employee(List<Address> addresses) {
		this.addresses = Collections.unmodifiableList(addresses);
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}
}
