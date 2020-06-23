package com.capgemini.oca.final_test;

public class Question21 {
	public static void main(String[] args) {
		A1 a12 = new A1() {
			public void printValue() {
				System.out.println("A");
			}
		};
		a12.printValue();
	}
}

interface A1 {
	public void printValue();
}
