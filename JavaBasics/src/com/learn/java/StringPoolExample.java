package com.learn.java;

public class StringPoolExample {
	public static void main(String[] args) {

		String s1 = "test";
		String s2 = "test";

		String s3 = new String("test");
		String s4 = new String("test");

		System.out.println("Is s1 equals s2? : " + (s1.equals(s2)));
		System.out.println("Is s3 equals s4? : " + (s3.equals(s4)));
		System.out.println("Is s1 equals s3? : " + (s1.equals(s3)));

		System.out.println("Is s1 == s2? " + (s1 == s2)); // Because of Strin Pool Concept
		System.out.println("Is s3 == s4? " + (s3 == s4));
		System.out.println("Is s1 == s3? " + (s1 == s3));

	}
}
