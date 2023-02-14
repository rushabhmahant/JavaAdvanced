package com.cts.practiceprograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		long num = 1634;
		long sum = 0, digit = 0;
		long temp = num;
		
		while(temp!=0) {
			digit = temp%10;
			sum += Math.pow(digit, String.valueOf(num).length());
			temp /= 10;
		}
		boolean armstrong = (num == sum) ? true : false;
		System.out.println("Number is armstrong: " + armstrong);
	}

}
