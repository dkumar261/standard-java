package com.sample.stream.filter.array;

class Dog {

	public int price;

	public Dog() {
		System.out.println("Dog conts------------");
	}

	public Dog(int price) {
		this.price = price;
	}

	public Dog myDog() {
		return new Dog(108);
	}

	public void disp() {
		System.out.println("------------------PEEK --------------------");
	}
}

interface ITest {
	Object getDog();
}

public class Test {

	public static void main(String[] args) {

		ITest test = Dog::new;
		((Dog) test.getDog()).disp();
	}
}
