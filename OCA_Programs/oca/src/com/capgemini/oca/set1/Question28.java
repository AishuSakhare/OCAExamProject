package com.capgemini.oca.set1;

public class Question28 {
	
	void read(int cardno) throws  Exception{
		System.out.println("reading");
	}
	
	void check(int cardno) throws RuntimeException{
		System.out.println("check");
	}

	public static void main(String[] args) {
		Question28 obj = new Question28();
		int cardno = 1234;
		
		//obj.read(cardno);				// checked Exception
		obj.check(cardno);
		
	}
}
