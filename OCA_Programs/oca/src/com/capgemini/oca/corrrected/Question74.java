package com.capgemini.oca.corrrected;

public class Question74 {

	public static void main(String[] args) {
		int num1[]= new int[0];
		int num2[]= {1,2,3,4,5};
		num1 =num2;
		for (int i : num1) {
			System.out.println(i);
		}
	}
}