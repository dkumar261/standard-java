package com.sample.optional;

import java.util.Optional;

class OptionalDemo {

	static public Optional<String> getValue() {

		String value = "This example of optional";
		Optional<String> optional = Optional.ofNullable(value);
		return optional;
	}
}

public class Test {

	public static void main(String[] args) {

		Optional<String> value = OptionalDemo.getValue();
		String stringValue = value.get();
		System.out.println(stringValue);
		
		String getValue = value.orElse("Default value");
		System.out.println(getValue);

	}
}