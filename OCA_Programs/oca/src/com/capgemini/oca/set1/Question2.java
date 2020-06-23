package com.capgemini.oca.set1;

public class Question2 {

	public static void main(String[] args) {
		byte b = 1;
		Integer i1 = new Integer("1");
		short s2 = 1;
		int i2 =1;
		
		char c ='1'; //no error no exception but goes in default case
		
		
		float f =1; 	//error
		
		long l = 1;               //error
		double d =1;            //error
		String s1 = "1";        //error //string works but here cases are not matches with string values sysntactically ""
		
		
		switch (c) {
		case 1:
			System.out.println("in case 1");
			break;

		default:
			System.out.println("in deafult");
			break;
		}
	}
}
