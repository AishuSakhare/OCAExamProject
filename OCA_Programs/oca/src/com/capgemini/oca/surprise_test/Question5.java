package com.capgemini.oca.surprise_test;

public class Question5 {

	public static void main(String[] args) {
		short a1 = 6;
		new Question5().go(a1);
		new Question5().go(new Integer(7));
	}

	void go(Short x) {
		System.out.print("S ");
	}

	void go(Long x) {
		System.out.print("L ");
	}

	void go(int x) {
		System.out.print("i ");
	}

	void go(Number n) {
		System.out.print("N ");
	}
}
