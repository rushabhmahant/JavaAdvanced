package com.cts.java8;

@FunctionalInterface
interface Shape {
	double area();
	default String defaultShape() {
		return "Square";
	}
	static int numberOfSides() {
		return 4;
	}
}

public class DefaultMethod {
	
	public static void main(String[] args) {
		Shape s = Shape::numberOfSides;
		System.out.println(s.area());
	}

}
