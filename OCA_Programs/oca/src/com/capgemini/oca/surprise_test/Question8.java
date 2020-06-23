package com.capgemini.oca.surprise_test;

public class Question8 {

	public static void main(String[] args) {
		String s = "-";
		boolean b = false;
		int x = 7, y = 8;
		if ((x++ < 8) ^ (b = true)) {
			System.out.println("inside1");
			s += "^";
		}
		System.out.println("value of x = "+x);
		System.out.println("value of b 1 ="+b);
		if (!(x > 8) | ++y > 5) {
			System.out.println("inside2");
			s += "|";
		}
		System.out.println("value of y"+y);
		if (++y > 9 && b == true && x++<9) {
			System.out.println("value of y 2 ="+y);
			System.out.println("value of b 2 ="+b);
			System.out.println("inside3");
			s += "&&";
		}
		System.out.println("value of x = " +x);
		if (y % 8 > 1 || y / (x - 7) > 1) {
			System.out.println("inside4");
			s += "%";
		}
		System.out.println(s);
		System.out.println(y);

	}
}
