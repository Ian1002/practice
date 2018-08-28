package com.ian.practice.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime currentTime = LocalDateTime.now();

		System.out.println(currentTime);

		System.out.println(currentTime.getYear());

		System.out.println(currentTime.getMonthValue());

		System.out.println(currentTime.getDayOfMonth());

		System.out.println(currentTime.getDayOfWeek());

		System.out.println(currentTime.getDayOfYear());

		System.out.println(currentTime.getMinute());

		System.out.println(currentTime.getSecond());

		LocalDateTime date2 = currentTime.withDayOfMonth(2).withYear(2011);

		System.out.println(date2);

		LocalDate date3 = LocalDate.of(2011, Month.DECEMBER, 12);

		System.out.println(date3);

		LocalTime time = LocalTime.parse("12:12:12");

		System.out.println(time);
		
		
		LocalDateTime birthday = LocalDateTime.parse("1992-10-27T11:32:14",DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(birthday);
		
		System.out.println(birthday.compareTo(LocalDateTime.now()));
		
	}
}
