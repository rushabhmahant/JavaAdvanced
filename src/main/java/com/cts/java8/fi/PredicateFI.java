package com.cts.java8.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateFI {
	
	public static void main(String[] args) {
		
		//	Program to check prime number
		
		Predicate<Integer> checkPrime = (num) -> {
			return num>1 && !IntStream.rangeClosed(2, num/2).anyMatch((n) -> num%n==0);
		};
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		
		//numbers.forEach((number) -> System.out.println(number + " is prime: " + checkPrime.test(number)));
		IntStream.rangeClosed(0, 100).forEach((number) -> System.out.println(number + " is prime: " + checkPrime.test(number)));
	}

}
