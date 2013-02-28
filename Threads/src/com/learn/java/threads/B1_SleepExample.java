package com.learn.java.threads;

public class B1_SleepExample {
	public static void main(String[] args) throws InterruptedException {
		String importantInfo[] = { "Mares eat oats", "Does eat oats",
				"Little lambs eat ivy", "A kid will eat ivy too" };

		for (int i = 0; i < importantInfo.length; i++) {
			// pause for 4 seconds.
			Thread.sleep(4000);

			// print a message
			System.out.println(importantInfo[i]);
		}
	}
}
