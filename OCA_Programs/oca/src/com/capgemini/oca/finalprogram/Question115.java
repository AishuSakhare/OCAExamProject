package com.capgemini.oca.finalprogram;

public class Question115 {

	String mystr ="7007";
	
	public void doSuff(String str) {
		int myNum=0;
		try {
			String mystr = str;
			myNum = Integer.parseInt(mystr);
		}catch (NumberFormatException e) {
			System.out.println("error");
		}
		System.out.println("mystr"+mystr+"mynum"+myNum);
	}
	
	public static void main() {
		Question115 obj = new Question115();
		obj.doSuff("9009");
	}
	
	public static void main(String[] []arg) {
		
	}
}
