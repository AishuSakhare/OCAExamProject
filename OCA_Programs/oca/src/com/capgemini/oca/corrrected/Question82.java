package com.capgemini.oca.corrrected;

public class Question82 {

	private char var;
	public static void main(String[] args) {
		char var1='a';
		char var2=var1;
		var2='e';
		
		Question82 obj1 = new Question82();
		Question82 obj2 = obj1;
		Question82 obj3 = obj2;
		obj1.var='i';
		obj2.var ='o';
		obj3.var='t';
		
		System.out.println(var1+ ","+var2);
		System.out.println(obj1.var+","+obj2.var);
	}
}
