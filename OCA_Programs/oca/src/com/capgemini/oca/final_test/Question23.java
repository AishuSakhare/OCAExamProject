package com.capgemini.oca.final_test;

public class Question23 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		newPrint(b);
		newPrint(c);
		
	}

	public static void newPrint(A12 a) {
		a.printValue();
	}

}

class A12 {
	public void printValue() {
		System.out.println("Value-A");
	}
}

class B extends A12 {
//	public void printValue() {
//		System.out.println("Value-b");
//	}
	public void printNameB() {
		System.out.println("Name-B");
	}
}

class C extends A12 {
//	public void printValue() {
//		System.out.println("Value-c");
//	}
	public void printNameC() {
		System.out.println("Name-C");
	}
}