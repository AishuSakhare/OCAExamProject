package com.capgemini.oca.finalprogram;

public class Question45 {

	int a1;

	public static void doProduct(int a) {

		a = a * a;
	}

	public static void doString(StringBuilder s) {
		//s.concat("" + s);
		s.append("" + s);
	}

	public static void main(String[] args) {
		Question45 item = new Question45();
		item.a1 = 11;
		StringBuilder sb = new StringBuilder("hello");
		//String sb = "hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + "" + sb + "" + item.a1);
	}

}
