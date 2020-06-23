package com.capgemini.oca.OCA_SET1;

public class Question11 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("eLion");
		
		String ejb = null;
		
		ejb = sb1.append("x").substring(sb1.indexOf("L"), sb1.indexOf("x"));
		
		System.out.println(ejb);
	}
}
