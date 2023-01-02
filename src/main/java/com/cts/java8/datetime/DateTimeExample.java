package com.cts.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("mm-dd-yyyy HH:mm:ss");
		
		String formattedDate = currentDate.format(formatter);
		System.out.println("Formatted date: " + formattedDate);
		
	}

}
