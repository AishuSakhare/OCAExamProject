package com.capgemini.oca.surprise_test;

public class Question1 {

	static int count = 0;

	Question1() {
		while (count < 10)
			new Question1(++count);
	}

	Question1(int x) {
		super();
	}

	public static void main(String[] args) {
		new Question1();
		new Question1(count);
		System.out.println(count++);
	}

}
