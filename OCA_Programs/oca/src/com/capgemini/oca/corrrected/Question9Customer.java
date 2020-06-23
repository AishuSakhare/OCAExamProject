package com.capgemini.oca.corrrected;

public class Question9Customer {
	public static void main(String[] args) {
		Question9Customer obj = new Question9Customer();
		obj.useElectricity(20);
	}

	public void useElectricity(double kwh) {
		Question9ElectricAccount acct = new Question9ElectricAccount();
		acct.addKWH(kwh);
	}
}
