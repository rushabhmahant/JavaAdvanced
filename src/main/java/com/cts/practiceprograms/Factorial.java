package com.cts.practiceprograms;

import java.util.stream.LongStream;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		//Using recursion
		long factorial = factorial(num);
		System.out.println("Factorial of " + num + " is " + factorial);
		
		//Using loop
		factorial = 1L; 
		int temp = num;
		
		while(temp>1) {
			factorial *= temp;
			temp--;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
		
		//Using Streams
		factorial = LongStream.rangeClosed(1, num).reduce(1, (i, j) -> i*j);
		System.out.println("Factorial of " + num + " is " + factorial);
	}

	private static long factorial(int num) {
		if(num == 0 || num ==1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
