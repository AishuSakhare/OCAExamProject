package com.capgemini.oca.OCP_test_que;

public class Question5 {

	static Integer i;

	public static void main(String[] args) {
		try {
			System.out.println(i);
			System.out.println(i.compareTo(0));
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("exception");
		}
	}
}
