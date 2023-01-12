package com.cts.practiceprograms;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		String str = "abc123z321cba";
		
		int endIndex = (str.length()/2);
		boolean palindrome = true;
		
		for(int i=0;i<endIndex;i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				palindrome = false;
				break;
			}
		}
		
		String msg = palindrome ? "\" is a palindrome." : "\" is not a palindrome.";
		System.out.println("String \"" + str + msg);
		
		
	}

}
