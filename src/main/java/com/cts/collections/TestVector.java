package com.cts.collections;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<Integer>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.remove(0);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
