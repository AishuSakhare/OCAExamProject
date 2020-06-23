package com.capgemini.oca.final_test;

public class Question11 {

	public static void printValue(int i, int j, int k) {
		System.out.println("int");
	}

	public static void printValue(byte i, byte j, byte k) {
		System.out.println("long");
	}

	public static void main(String... args) {
		byte b = 9;
		printValue(b, b, b);
	}
}
