package com.capgemini.oca.set1;

public class Question53 {

	public static final int MIN = 1;
	
	public static boolean check(int x) {
		return (x>=MIN) ? true :false;
	}
	public static void main(String[] args) {
		int x = args.length;
		if(check(x)) {
			System.out.println("se");
		}
		else {
			System.out.println("ee");
		}
	}
}
