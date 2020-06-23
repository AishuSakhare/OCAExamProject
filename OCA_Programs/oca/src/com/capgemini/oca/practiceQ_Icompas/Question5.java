package com.capgemini.oca.practiceQ_Icompas;

public class Question5 {

	public static void main(String[] args) {
		
	}
}

class A {
	String a = "A";

	public String getData() {

		return "Hi";
	}
}

class B1 extends A {
	String a = "B";

	public String getData() {

		return "Bye";
	}
}

class Test1 {

	public static void go() {
		A a = new B1();
		System.out.println(a.a + " " + a.getData());
	}

	public static void main(String[] args) {
		go();
		A a = new B1();
		System.out.println(a.a + " " + a.getData());
	}
}
