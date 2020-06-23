package com.capgemini.oca.corrrected;

public class Question42 {

	public static String abc(String creadit) {
		String x= "xxxx-xxxx-xxxx-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(creadit,15,19);
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(abc("1234-1234-1234-1234"));
	}
}
