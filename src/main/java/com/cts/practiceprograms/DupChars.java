package com.cts.practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class DupChars {
	
	public static void main(String[] args) {
		
		String s = "abcaabcabbcd";
		char ch[] = s.toCharArray();
		
		Map<Character, Integer> occurences = new HashMap<Character, Integer>();
		
		for(char c: ch) {
			if(occurences.containsKey(c)) {
				occurences.put(c, occurences.get(c) + 1);
			}
			else {
				occurences.put(c, 1);
			}
		}
		
		System.out.println("Duplicate characters are: ");
		occurences.forEach((k, v) -> {
			if(v>1) {
				System.out.println(k + ", ");
			}
		});
		
	}

}
