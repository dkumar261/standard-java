package com.sample.thread;

public class SequencePrintingThread implements Runnable {

	public int PRINT_NUMBERS_UPTO = 20;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	public SequencePrintingThread(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {

		while (number < PRINT_NUMBERS_UPTO - 1) {
			synchronized (lock) {
				while (number % 3 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(this+"  =  "+Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}
