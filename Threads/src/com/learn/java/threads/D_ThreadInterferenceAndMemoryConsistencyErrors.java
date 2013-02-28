package com.learn.java.threads;

public class D_ThreadInterferenceAndMemoryConsistencyErrors {

	public static void main(String[] args) {
		System.out.println("Hey!!");

		ThreadLogger test = new ThreadLogger();
		Thread a = new Thread(test);
		Thread b = new Thread(test);

		a.start();
		b.start();
	}

}

class ThreadLogger implements Runnable {

	private static boolean staticMethodInvoked;

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " running!!");

		if (!staticMethodInvoked) {
			ThreadLogger.staticLogger();
		} else {
			instanceLogger();
		}
	}

	public static void staticLogger() {
		staticMethodInvoked = true;
		System.out.println("You invoked the static logger.");
	}

	public void instanceLogger() {
		System.out.println("You invoked the instance logger.");
	}
}