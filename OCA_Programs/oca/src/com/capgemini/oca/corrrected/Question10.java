package com.capgemini.oca.corrrected;

public class Question10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(0);
		String s = "";
		
		
		if(sb.equals(s)) {
			System.out.println("match 1");
		}
		else if(sb.toString().equals(s.toString())){
			System.out.println("........"+sb.toString());
		System.out.println("match 2");
		}
		else {
			System.out.println("no match");
		}
	}
}
