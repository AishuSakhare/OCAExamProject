package com.capgemini.oca.corrrected;

public class Question71 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Question71MyException e) {
			System.out.println("A");
		}
	}

	public static void method1() {

		try {
			System.out.println(Math.random());
			System.out.println("..........."+Math.random());
			throw Math.random() > 0.5 ? new Question71MyException() : new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("B");
		}
	}
}
