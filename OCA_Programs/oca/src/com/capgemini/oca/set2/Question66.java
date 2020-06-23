package com.capgemini.oca.set2;

public class Question66 {

	public static void main(String[] args) {
		int ans;
		try {
			int num=10;
			int div =0;
			ans = num/div;
		} catch (ArithmeticException e) {
			ans =0;System.out.println("a");
		}
		catch (Exception e) {
			System.out.println("Invalid calculation");
		}
	//	System.out.println("answer"+ans);
		System.out.println("hello");
	}
}
