package com.cts.collections;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> primeNumbers =
				new Stack<Integer>();
		primeNumbers.push(17);
		primeNumbers.push(13);
		primeNumbers.push(11);
		primeNumbers.push(2);
		primeNumbers.push(5);
		primeNumbers.pop();
		
		Iterator<Integer> it = primeNumbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
