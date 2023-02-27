package com.sample.stream.exception;

public class Test {

	public static void main(String[] args) {

		String s1 = "A";
		String s2 = new String("B");
		String s3 = "C";
		String s4 = "D";
		String s5 = s3 + s4;

		s2 = s2.concat(s5);
		String s6 = "BCD";

		System.out.println(s2);
		System.out.println(s6);
		System.out.println(s2 == s6);

	}
}

class A {
	public void take() throws RuntimeException {
	}
}

class B extends A {
	@Override
	public void take() {
	}
}