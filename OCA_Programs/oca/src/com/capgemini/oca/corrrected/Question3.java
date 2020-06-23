package com.capgemini.oca.corrrected;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question3 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2011-12-03").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}
}
