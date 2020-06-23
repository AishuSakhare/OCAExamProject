package com.capgemini.oca.set2;

public class Question58 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb.toString());
		sb.delete(0, sb.length());
		System.out.println(sb.toString());
	}
}
