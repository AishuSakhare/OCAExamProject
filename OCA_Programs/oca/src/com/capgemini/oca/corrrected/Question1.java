package com.capgemini.oca.corrrected;

public class Question1 {

	public void updatePrice(Question1Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {

		Question1Product prt = new Question1Product();
		prt.price = 200;
		double newprice	 = 100;

		Question1 t = new Question1();
		System.out.println(".........." + prt.price + "...." + newprice);
		t.updatePrice(prt, newprice);
		System.out.println(".........." + prt.price + "...." + newprice);
	}
}
