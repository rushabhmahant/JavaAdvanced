package com.cts.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	
	public static void main(String[] args) {
		HashSet<Integer> primeNumbers = new HashSet<Integer>();
		System.out.println(primeNumbers.isEmpty());
		primeNumbers.add(5);
		primeNumbers.add(23);
		primeNumbers.add(17);
		primeNumbers.add(3);
		primeNumbers.add(null);
		//primeNumbers.add(null);
		System.out.println(primeNumbers.isEmpty());
		
		Iterator<Integer> it = primeNumbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
