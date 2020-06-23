package com.capgemini.oca.final_test;

public class Question22 {
	public static void main(String[] args) {
		Abc a = new Abc();
// INSERT CODE
		Abc.A1 a1 = a.new A1();
		a1.printValue();
	}

}

class Abc {
	class A1 {
		void printValue() {
			System.out.println("A.A1");
		}
	}
}
