package com.sample.functional.interaces;

import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		Consumer<String> consumer = (name) -> name.length();
		consumer.accept("Hello"); // is not going to return anything just accept a parameter to consume.
	}
}
