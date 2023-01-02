package com.cts.java8.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {
	
	public static void main(String[] args) {
		
		//	Program to print unique values from list of string
		
		Consumer<List<String>> removeDuplicates = list -> 
			list.stream().distinct().forEach(System.out::println);
		
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("B");
		strList.add("C");
		strList.add("C");
		strList.add("C");
		
		removeDuplicates.accept(strList);
	}

}
