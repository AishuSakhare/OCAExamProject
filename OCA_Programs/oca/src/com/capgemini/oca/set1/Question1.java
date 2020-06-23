package com.capgemini.oca.set1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Question1 {

	public static void main(String[] args) {
		
		// exception->
	   // String date1 = LocalDate.parse("2020-12-11T21:25:04.800842+01:00").format(DateTimeFormatter.ISO_DATE_TIME);
		
		//correction ->
		String date = OffsetDateTime.parse("2020-12-11T21:25:04.800842+01:00").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}
}


// ans = option A
//exception throw