package com.sample.thread;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Runnable runnable = () -> {
			System.out.println(Thread.currentThread().getName());
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
