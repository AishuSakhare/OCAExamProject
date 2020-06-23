package com.capgemini.oca.surprise_test;

public class Question17 {

	int x = 5;

	public static void main(String[] args) {
		final Question17 f1 = new Question17();
		Question17 f2 = new Question17();
		Question17 f3 = FizzSwitch(f1, f2);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x));
	}

	static Question17 FizzSwitch(Question17 x, Question17 y) {
		final Question17 z = x;
		z.x = 6;
		return z;
	}

}
