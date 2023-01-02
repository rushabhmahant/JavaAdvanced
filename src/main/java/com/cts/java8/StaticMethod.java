package com.cts.java8;

@FunctionalInterface
interface Beverage {
	void manufacture();
	static String drink() {
		return "Drinking the beverage...";
	}
}

public class StaticMethod {
	
	public static void main(String[] args) {
		Beverage coke = () -> System.out.println("Manufacture coke");
		coke.manufacture();
		System.out.println(Beverage.drink());
	}

}
