package com.capgemini.oca.OCA_SET1;

public class Question17 {

	void abc() {
		try {
			abc();
		}
		catch(StackOverflowError e) {
			System.out.println("zxcvbnm");
		}
	}
	public static void main(String[] args) {
		new Question17().abc();
	}
}
