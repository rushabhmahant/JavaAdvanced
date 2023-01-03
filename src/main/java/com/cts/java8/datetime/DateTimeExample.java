package com.cts.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class DateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		
		String formattedDateTime = currentDateTime.format(dateTimeFormatter);
		System.out.println("Current date: " + currentDateTime);
		System.out.println("Formatted date: " + formattedDateTime);
		
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getDayOfYear());
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(LocalDate.of(2023, 5, 9).getDayOfWeek());
		System.out.println(currentTime.getNano());
		
		//	Adjusters
		
		LocalDate firstDayOfNextMonth = 
				currentDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First date of next month: " + firstDayOfNextMonth);
		
		LocalDate comingSunday = 
				currentDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Coming Sunday: " + comingSunday);
		
		LocalDate firstDayOfThisMonth = 
				currentDate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("This month started from " + firstDayOfThisMonth.getDayOfWeek());
		
		//	ChronoUnit
		
		System.out.println("Next year would be: " + currentDate.plus(1, ChronoUnit.YEARS));
		System.out.println("Date after 2 decades would be: " + currentDate.plus(2, ChronoUnit.DECADES));
		
		//	Gap
		
		LocalDate pastDate = LocalDate.of(2014, 8, 1);
		
		Period timePeriod = Period.between(pastDate, currentDate);
		System.out.println("Days in period: " + timePeriod + ", total days: " + ChronoUnit.DAYS.between(pastDate, currentDate));
		
	}

}
