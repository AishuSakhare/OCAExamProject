package com.capgemini.oca.finalprogram;

public class Question126 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		boolean ans = sb.toString().isEmpty();
		System.out.println(ans);
		if(sb.equals(s)) {
			System.out.println("1");
		}
		else
		if(sb.toString().equals(s)){
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
	}
}
