package com.sample.functional.interaces;

import java.util.function.Supplier;

public class SupplierSample {

	public static void main(String[] args) {
		Supplier<String> supplier = ()-> "dd"	;
		String val = supplier.get();
		System.out.println(val);
	}
}
