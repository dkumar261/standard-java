package com.sample.fabnnaci;

public class Test {

	public static void main(String[] args) {
		int a = 1, b = 2;

		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 50; ++i) {
			int temp = b;
			b = a + b;
			a = temp;
			System.out.println(b);
		}
	}
}
