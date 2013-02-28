package com.learn.java.threads.tricks;

/**
 * This is example for start() vs run() question.
 * 
 * @author Srinivas
 * 
 */
public class Runner {
	public static void main(String[] args) {
		new Thread(new SampleThread()).start(); // This actually creates a new
												// Thread and invokes the run
												// method on that thread.
		new SampleThread().run(); // This will not create a new thread and the
									// run method executed on the same thread in
									// which the method is invoked.
	}
}
