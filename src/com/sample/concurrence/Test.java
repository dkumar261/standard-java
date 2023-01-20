package com.sample.concurrence;

public class Test {

	public static void main(String[] args) {
		
		int num = 8099;
		
		String.valueOf(num);
		
		System.out.println("8099".hashCode());
		System.out.println(String.valueOf(num).hashCode());
	}
}
