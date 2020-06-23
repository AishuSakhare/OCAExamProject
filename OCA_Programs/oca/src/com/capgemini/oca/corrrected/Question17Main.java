package com.capgemini.oca.corrrected;

public class Question17Main {

	public static void main(String[] args) {
		Question17 obj = new Question17((int)(Math.random()*1000));
//		obj.amount =0;
	//	obj.changeAmount(0);
		System.out.println("................value of amount"+obj.amount);
	//	obj.changeAmount(-obj.amount);
	obj.changeAmount(-obj.getAmount());
		System.out.println(obj.getAmount());
	}
}
