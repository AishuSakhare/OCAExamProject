package com.capgemini.oca.set2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question35 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt = dt.plusDays(30);
		dt = dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
