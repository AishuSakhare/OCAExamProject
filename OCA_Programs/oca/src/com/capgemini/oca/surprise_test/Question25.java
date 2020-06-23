package com.capgemini.oca.surprise_test;

public class Question25 {
	public static void main(String[] args) {

		String o = "-";
System.out.println("FRED".toLowerCase().substring(1, 3));
		switch ("FRED".toLowerCase().substring(1, 3)) {
		case "yellow":
			o += "y";
		case "re":
			o += "r";
		case "green":
			o += "g";
		}
		System.out.println(o);
	}

}
