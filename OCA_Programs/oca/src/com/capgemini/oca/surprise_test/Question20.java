package com.capgemini.oca.surprise_test;

public class Question20 {

	String name;

	Question20(String s) { name = s; }

	public static void main(String[] args) {
		Question20 d1 = new Question20("Boi");
		Question20 d2 = new Question20("Tyri");
		System.out.print((d1 == d2) + " ");
		Question20 d3 = new Question20("Boi");
		d2 = d1;
		System.out.print((d1 == d2) + " ");
		System.out.print((d1 == d3) + " ");
	}

}
