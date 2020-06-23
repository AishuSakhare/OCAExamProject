package com.capgemini.oca.finalprogram;

class Question28 {

}

class Customer {

	Electric acct = new Electric();

	public void use(double kwh) {
		acct.addKWH(kwh);
	}
}

class Electric {
	private double kwh;
	private double rate = 0.07;
	private double bill;

	public void addKWH(double kwh2) {
		// TODO Auto-generated method stub

	}

}
