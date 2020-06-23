package com.capgemini.oca.finalprogram;

public class Question123Test {

	public void updatePrice(Question123Product product,double newprice) {
		newprice = newprice *2;
		product.price = product.price + newprice;
		System.out.println(product.price+"........."+newprice);
	}
	
	public static void main(String[] args) {
		Question123Product prt  = new Question123Product();
		prt.price= 200;
		double newprice =100;
		
		
		Question123Test t = new Question123Test();
		t.updatePrice(prt, newprice);
		System.out.println(prt.price+"........."+newprice);
	}
}
