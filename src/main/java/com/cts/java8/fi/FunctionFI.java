package com.cts.java8.fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;

public class FunctionFI {
	
	public static void main(String[] args) {
		
		//	Program to extract character with maximum occurence from a list
		
		Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
		
		Function<List<Character>, Map<Character, Integer>> characterOccurence = (list) -> {
			list.stream().forEach((character) -> {
				if(tempMap.containsKey(character)) {
					tempMap.put(character, tempMap.get(character) + 1);
				}
				else {
					tempMap.put(character, 1);
				}
			});
			
			return tempMap;
		};
		
		List<Character> charList = new ArrayList<Character>();
		charList.add('A');
		charList.add('@');
		charList.add('@');
		charList.add('B');
		charList.add('*');
		charList.add('@');
		charList.add('%');
		charList.add('*');
		charList.add('*');
		charList.add('@');
		
		Map<Character, Integer> charOccurenceMap = characterOccurence.apply(charList);
		
		/*for(Map.Entry<Character, Integer> map: charOccurenceMap.entrySet()) {
			System.out.println(map.getKey() + ": " + map.getValue());
		}*/
		
		charOccurenceMap.forEach((k, v) -> System.out.println(k + ": " + v));
		
		Optional<Entry<Character, Integer>> maxCharacterCount = charOccurenceMap.entrySet().stream()
				.reduce((e1, e2) -> e1.getValue()>e2.getValue()?e1:e2);
		System.out.println(maxCharacterCount.isPresent() ? maxCharacterCount.get() : "List is empty");
		
		// Below code is just for practice
		System.out.println("-----");
		Map<Integer, String> spellMap = new HashMap<Integer, String>();
		spellMap.put(null, "null");
		spellMap.put(1, "One");
		spellMap.put(null, "NULL");
		spellMap.put(2, "Two");
		spellMap.put(3, "Three");
		
		spellMap.entrySet().stream().forEach((entry) -> System.out.println(entry.getKey() + "-" + entry.getValue()));
		spellMap.keySet().stream().forEach((k) -> System.out.println(k));
	}

}
