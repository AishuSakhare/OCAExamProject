package com.capgemini.oca.set2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question36Test {

	public static void checkAge(List<Question36> list, Predicate<Question36> pre) {
		for (Question36 p : list) {
			if (pre.test(p)) {
				System.out.println(p.name);
			}
		}
	}

	public static void main(String[] args) {
		List<Question36> iList = Arrays.asList(new Question36("hank", 45), new Question36("Charlie", 40),
				new Question36("smith", 38));

		checkAge(iList, p -> p.getAge() > 40);

	}
}
