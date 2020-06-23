package com.capgemini.oca.finalprogram;

public class Question78 {
	
	public static String mask(String c) {
		String x = "XXXX-XXXX-XXXX-";
		//return x+c.substring(15,19);
		StringBuilder sb = new StringBuilder(x);
		sb.append(c,15,19);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(mask("1234-1234-1234-1234"));
	}
}
