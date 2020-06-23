package com.capgemini.oca.finalprogram;

public class Question137 {

	void readCard(int cardNo) throws Exception{
		System.out.println("reading");
	}
	
	void checkCard(int cardNo) throws ArithmeticException{
		System.out.println("checking");
	}
	
	public static void main(String[] args) {
		Question137 obj = new Question137();
		int cardNo =1234;
		//obj.readCard(cardNo);
		obj.checkCard(cardNo);
	}
}
