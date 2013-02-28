package com.learn.java.threads;

/**
 * An application that creates an instance of Thread must provide the code that
 * will run in that thread. There are two ways to do this:
 * 
 * 1. Provide Runnable Object.
 * 
 * 2. Subclass Thread.
 * 
 * Below is an example for Sub-classing Thread way of creating and providing
 * implementation for a thread.
 * 
 * 
 * The Thread class itself implements Runnable, though its run method does
 * nothing.
 * 
 * An application can subclass Thread, providing its own implementation of run,
 * as in the below HelloThread example:
 * 
 * @author smeda
 * 
 */
public class A2_HelloThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from a Thread!!");
	}

	public static void main(String[] args) {
		new A2_HelloThread().start();
	}
}
