package com.capgemini.oca.OCA_SET1;

public class Question2 {

	public static void main(String[] args) {
		Phone1 obj = new Tablet();
		System.out.println(obj.a + "" );

	}

}

class Phone1 {
	String a = "phone1";
}

class Tablet extends Phone1 {
	String b = "tablet";
}
