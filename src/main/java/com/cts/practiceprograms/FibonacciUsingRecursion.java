package com.cts.practiceprograms;

public class FibonacciUsingRecursion {
	
	public static void main(String[] args) {
		
		//	Using recursion
		int n = 15;
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i) + ", ");
		}
		
		System.out.println();
		
		//	Using loop
		int first = 0, next = 1,sum = 0;
		if(n >= 1) {
			System.out.print(first + ", ");
		}
		if(n >= 2) {
			System.out.print(next + ", ");
			sum += next;
		}
		for(int i=2;i<n;i++) {
			System.out.print(sum + ", ");
			first = next;
			next = sum;
			sum = next + first;
		}
		
	}

	private static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
