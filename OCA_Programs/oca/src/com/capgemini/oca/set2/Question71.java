package com.capgemini.oca.set2;

public class Question71 {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 =  new String("java");
		str1.toLowerCase();
		if(str1.equals(str2)) {
			System.out.println("e");
		}
		else {
			System.out.println("no");
		}
	}
}
