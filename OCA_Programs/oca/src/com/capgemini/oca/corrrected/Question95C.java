package com.capgemini.oca.corrrected;

public class Question95C extends Question95A{

	public void test() {
		System.out.println("c");
	}
	public static void main(String[] args) {
		Question95A b1 = new Question95A();
		Question95A b2 = new Question95C();
		
		b1 = (Question95A) b2;
		Question95A b3 = (Question95B) b2;
		
		b1.test();
		b3.test();
		
	}
}
