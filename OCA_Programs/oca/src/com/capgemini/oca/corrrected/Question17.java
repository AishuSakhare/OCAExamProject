package com.capgemini.oca.corrrected;

public class Question17 {

	public int amount;
	public Question17(int amount) {
	this.amount = amount;	
	}
	
	public int getAmount() {
		System.out.println("......2....");
		return amount;
	}
	public void changeAmount(int x) {
		System.out.println(".....1....");
		System.out.println("value of x before"+x);
		System.out.println("value of amount before"+amount);
		amount += x;
		System.out.println("value of x"+x);
		System.out.println("value of amount"+amount);
	}
}
