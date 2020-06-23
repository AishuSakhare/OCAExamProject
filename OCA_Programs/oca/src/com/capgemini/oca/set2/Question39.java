package com.capgemini.oca.set2;

public class Question39 {

	int amount;

	public Question39(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}

	public static void main(String[] args) {

		Question39 act = new Question39((int)(Math.random()*1000));
	
		//act.changeAmount(-act.amount);
		//act.amount = 0;
		//act.setAmount(-act.getAmount()); //wrong
		
		act.setAmount(0);
		System.out.println(act.getAmount());
	}
}
