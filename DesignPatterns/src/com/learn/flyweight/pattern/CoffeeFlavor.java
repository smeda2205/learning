package com.learn.flyweight.pattern;

//ConcreteFlyweight object that creates ConcreteFlyweight 
public class CoffeeFlavor {
	private final String flavor;

	public CoffeeFlavor(String newFlavor) {
		this.flavor = newFlavor;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void serveCoffee(CoffeeOrderContext context) {
		System.out.println("Serving Coffee flavor " + flavor
				+ " to table number " + context.getTable());
	}
}
