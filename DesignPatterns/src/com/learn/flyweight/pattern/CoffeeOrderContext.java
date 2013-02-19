package com.learn.flyweight.pattern;

public class CoffeeOrderContext {
	private final int tableNumber;

	public CoffeeOrderContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}
