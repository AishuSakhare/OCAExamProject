package com.capgemini.oca.corrrected;

public class Question7Car extends Question7Vehical {

	private static String type;
	private static int mazSpeed;
	String trans;
	

	Question7Car(String trans) {
		super(type);
		this.trans = trans;
	}

	Question7Car(String type, int mazSpeed, String trans) {
		super(type, mazSpeed);
		// this(trans);
	}

}