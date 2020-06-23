package com.capgemini.oca.corrrected;

public class Question119 {

	c2 obj1 = new c1();
	i obj2 = new c1();
	
	c2 s =  (c2) obj2;
	
}

class c2 {
	public void displayC2() {
		System.out.println("......from c2");
	}
}

interface i {
	public void displayI();
}

class c1 extends c2 implements i {

	@Override
	public void displayI() {
		System.out.println(".......from c1");
	}

}