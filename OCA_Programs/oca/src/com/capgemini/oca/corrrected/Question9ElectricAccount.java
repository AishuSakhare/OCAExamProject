package com.capgemini.oca.corrrected;

public class Question9ElectricAccount {

	private double kwh;
	private double rate = 0.07;
	private double bill;

	public void addKWH(double kwh) {
		this.kwh += kwh;
		System.out.println("............"+this.kwh);
		
		this.bill = this.kwh*this.rate;
		
		System.out.println("............."+this.bill);
	}
	
}
