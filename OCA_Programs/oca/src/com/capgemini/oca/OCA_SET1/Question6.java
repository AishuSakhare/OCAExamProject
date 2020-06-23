package com.capgemini.oca.OCA_SET1;

public class Question6 {

	public static void main(String[] args) {
		MainTest1 obj1 = new MainTest1();
		MainTest1 obj2 = new MainTest1();

		obj1.a = 100;
		obj2.a = 200;

		System.out.println(obj1.a + obj2.a);
	}
}

class MainTest1 {
	static int a;
}