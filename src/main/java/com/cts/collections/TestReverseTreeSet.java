package com.cts.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestReverseTreeSet {

	public static void main(String[] args) {

		// SortedSet in reverse alphabetical order
		TreeSet<Integer> primeNumbers = new TreeSet<Integer>(Collections.reverseOrder());

		primeNumbers.add(3);
		primeNumbers.add(11);
		primeNumbers.add(71);
		primeNumbers.add(23);
		primeNumbers.add(7);

		Iterator<Integer> it = primeNumbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
