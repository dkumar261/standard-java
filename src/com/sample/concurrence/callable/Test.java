package com.sample.concurrence.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable mc = new MyCallable();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> submit = executorService.submit(mc);
		String string = submit.get();
		System.out.println(string);
		
	}
}
