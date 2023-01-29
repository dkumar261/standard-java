package com.sample.thread;

/**
 * 
 * @author Dinesh Kumar
 *
 */
public class Test {

	public static void main(String[] args) {
		SequencePrintingThread runnable1 = new SequencePrintingThread(1);
		SequencePrintingThread runnable2 = new SequencePrintingThread(2);
		SequencePrintingThread runnable3 = new SequencePrintingThread(0);

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		Thread t3 = new Thread(runnable3, "T3");

		t1.start();
		t2.start();
		t3.start();
	}
}
