package com.learn.java.threads.tricks;

public class SampleThread implements Runnable{

	@Override
	public void run() {
		System.out.println("The Thread name: " + Thread.currentThread().getName());
	}
	
}
