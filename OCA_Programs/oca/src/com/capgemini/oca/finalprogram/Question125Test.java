package com.capgemini.oca.finalprogram;

public class Question125Test {

	public static void main(String[] args) {
		try {
			Method1();
		} catch (Question125MyException e) {
			System.out.println("A");
		}
	}
	
	public static void Method1() {
		try {
			System.out.println(Math.random());
			throw Math.random()>(-0.0)?new Question125MyException():new RuntimeException();
			
		} catch (RuntimeException e) {
			System.out.println("B");
		}
	}
}
