package com.capgemini.oca.finalprogram;

import java.time.LocalDate;

public class Question22 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 12, 3);
		date.plusDays(10);
		System.out.println(date);
	}

}
