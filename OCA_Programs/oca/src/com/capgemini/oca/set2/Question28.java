package com.capgemini.oca.set2;

public class Question28 {

	public static void main(String[] args) {
		int x =100;
		int a =x++;
		int b= ++x;
		int c = x++;
		int d = (a<b)?(a<c)?6:5:7;
		//int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : a;
		System.out.println(d);
	}
}
