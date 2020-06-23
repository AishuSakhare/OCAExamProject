package com.capgemini.oca.set1;

public class Question11 {
	
	int a1;
	public static void doproduct(int a) {
		
	}
	
	public static void addstring(String s) {
		s.concat(" "+s);
	}

	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.a1 = 11;
		String sb = "hello";
		Integer i = 10;
		
		doproduct(i);
		addstring(sb);
		doproduct(obj.a1);
		
		System.out.println(i);
		System.out.println(sb);
		System.out.println(obj.a1);
	}
}
