package com.capgemini.oca.finalprogram;

public class Question23 extends DerivedA {

	public void test() {
		System.out.println("DerivedB");
	}
	
	public static void main(String[] args) {
		Base b1 = new Question23();
		Base b2 = new DerivedA();
		Base b3 = new Question23();
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();
	}
}

class Base{
	public void test() {
		System.out.println("base");
	}
}


class DerivedA extends Base{
	public void test() {
		System.out.println("derivedA");
	}
}


