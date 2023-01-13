package com.sample.concurrence.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("-----invoked-----");
		return getValue();
	}

	public String getValue() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("-----return value-----");
		return "Hello World !!";
	}

}
