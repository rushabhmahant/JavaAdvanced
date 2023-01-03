package com.cts.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.cts.util.User;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		//	SortedSet
		Set<Integer> primeNumbers = 
				new TreeSet<Integer>();
		
		primeNumbers.add(3);
		primeNumbers.add(11);
		primeNumbers.add(71);
		primeNumbers.add(23);
		primeNumbers.add(53);
		primeNumbers.add(7);
		primeNumbers.add(97);
		primeNumbers.add(43);
		primeNumbers.add(31);
		primeNumbers.add(2);
		
		Iterator<Integer> it = primeNumbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//	Student lastName comparator
		
		TreeSet<User> studentList = new TreeSet<User>(Comparator.comparing(User::getLastName));
		studentList.add(new User("Tom", "Mills", 29));
		studentList.add(new User("Mark", "Zuckerberg", 25));
		studentList.add(new User("John", "Bernard", 35));
		
		Iterator<User> studentIterator = studentList.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
		
	}

}
