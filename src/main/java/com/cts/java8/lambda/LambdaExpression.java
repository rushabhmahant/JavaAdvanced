package com.cts.java8.lambda;

@FunctionalInterface
interface ScientificCalculator{
	double calculate(double x, double y);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		ScientificCalculator calculatePower  = (x, y) -> Math.pow(x, y);
		ScientificCalculator calculateRoot = (x, y) -> Math.pow(x, 1/y);
		
		System.out.println(calculatePower.calculate(2, 7));
		System.out.println(calculateRoot.calculate(27, 3));
	}

}
