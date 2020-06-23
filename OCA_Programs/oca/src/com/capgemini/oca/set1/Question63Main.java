package com.capgemini.oca.set1;

import java.io.IOException;

public class Question63Main {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch (Question63Exception e) {
			// TODO: handle exception
			System.out.println("A");
		}
	}
	
	public static void method1() {
		try {
			throw 3>10 ? new Question63Exception() : new IOException();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("i");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("B");
		}
	}
}
