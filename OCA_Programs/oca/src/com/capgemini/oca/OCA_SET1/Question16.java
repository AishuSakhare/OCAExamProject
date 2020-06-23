package com.capgemini.oca.OCA_SET1;

public class Question16 {

	String abc;
	
	Question16(String s){
		abc = s;
	}
	
	
}

class TestEqual{
	public static void main(String[] args) {
		Question16 b1 =  new Question16("12345");
		Question16 b2 =  new Question16("12345");
		
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
		
		System.out.println(b1 == b2);
		
	}
}
