package com.capgemini.oca.OCA_SET1;

public class Question10 {

	private int page = 100;
}

class abc1 extends Question10{
	private int i =2;
	private int method1() {
		return i;
	//	return super.page + this.i*5;
	}
	
	public static void main(String[] args) {
		System.out.println(new abc1().method1());
	}
}