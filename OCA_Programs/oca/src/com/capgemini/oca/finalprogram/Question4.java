package com.capgemini.oca.finalprogram;

public class Question4 {

	public void displayC2() {
		System.out.println("c2");
	}
}

interface I{
	public void displayI();
}

class c1 extends Question4 implements I{

	@Override
	public void displayI() {
		System.out.println("c1");
	}
	
}

class mainclass{
	
	Question4 obj1 = new c1();
	I obj2 = new c1();
	
	Question4 s = (Question4) obj2;
	I t = (I) obj1;
	
	
}