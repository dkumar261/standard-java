package com.sample.defaults;

interface Parent {

	public default void get() {
		System.out.println(this);
	}
}

interface Child {

	public default void get() {
		System.out.println(this);
	}
}

class Foo implements Parent, Child {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		Child.super.get();
		Parent.super.get();
	}

}

public class Test {

	public static void main(String[] args) {
		new Foo().get();
	}
}
