package com.capgemini.oca.practiceQ_Icompas;

public class Question26 {

}

class Sub extends Exception {

}

class SubSub extends Sub {

}

class A1 {
	void getData() throws Sub {
		System.out.println("byee");
	}
}

 class Test2 extends A1 {

	public static void main(String[] args) throws Exception {
		new Test2().getData();
	}

	void getData() {
		System.out.println("Hi");
	}
}
