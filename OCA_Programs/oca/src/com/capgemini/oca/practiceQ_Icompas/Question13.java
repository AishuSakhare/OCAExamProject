package com.capgemini.oca.practiceQ_Icompas;

public class Question13 {
	public static void main(String[] args) {
		X x = new X();
		X y = new Y();

		if (x instanceof Object) {
			System.out.println("True");
		}
		if (y instanceof Y) {
			System.out.println("True");
		}
		Y y1 = (Y) x;
		if (y1 instanceof X) {
			System.out.println("True");
		}

	}
}

class X{
	
}

class Y extends X{
	
}