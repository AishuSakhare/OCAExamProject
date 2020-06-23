package com.capgemini.oca.final_test;

public class Question16 {
public static void main(String[] args) {
	
}
}

class SuperClass {
	public int doIt(String str, Integer... data) throws Exception {
		String signature = "(String, Integer[])";
		System.out.println(str + " " + signature);
		return 1;
	}
}

class SubClass extends SuperClass {
	public int doIt(String str, Integer... data) {
		String signature = "(String, Integer[])";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}

	public static void main(String... args) throws Exception {
		SuperClass sb = new SubClass();
		sb.doIt("hello", 3);
	}
}