package com.learn.java.threads;

/**
 * An application that creates an instance of Thread must provide the code that
 * will run in that thread. There are two ways to do this:
 * 
 * 1. Provide Runnable Object.
 * 
 * 2. Subclass Thread.
 * 
 * 
 * Below is an example of Provide Runnable Object way to create a thread and
 * providing implementation.
 * 
 * The Runnable interface defines a single method, run, meant to contain the
 * code executed in the thread.
 * 
 * The Runnable object is passed to the Thread constructor, as in the below
 * example:
 * 
 * @author smeda
 * 
 */
public class A1_HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from a Thread!!");
	}

	public static void main(String[] args) {
		new Thread(new A1_HelloRunnable()).start();
	}
}
