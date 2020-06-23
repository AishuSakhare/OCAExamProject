package com.capgemini.oca.surprise_test;

public class Question16 {
	Question16() {
	}

	Question16(Question16 m) {
		m1 = m;
	}

	Question16 m1;

	public static void main(String[] args) {
		Question16 m2 = new Question16();
		Question16 m3 = new Question16(m2);
		m3.go();
		Question16 m4 = m3.m1;
		m4.go();
		Question16 m5 = m2.m1;
		m5.go();
	}

	void go() {
		System.out.print("hi ");
	}

}
