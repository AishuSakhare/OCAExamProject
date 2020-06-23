package com.capgemini.oca.set2;

public class Question6 {

	private char var;
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		Question6 obj1 =  new Question6();
		Question6 obj2 = obj1;
		obj1.var = 'o';
		obj2.var = 'i';
		
		System.out.println(var1+"    "+var2);
		System.out.println(obj1.var+"  "+obj2.var);
		
	}
}
