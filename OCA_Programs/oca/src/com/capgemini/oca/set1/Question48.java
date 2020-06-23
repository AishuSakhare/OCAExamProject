package com.capgemini.oca.set1;

public class Question48 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		String s = "Java";
		System.out.println(sb.toString());
		System.out.println(s.toString());
		if(sb.toString().equals(s.toString())) {
			System.out.println("match1");
		}else
		if(sb.equals(s)) {
			System.out.println("match2");
		}
	}
}
