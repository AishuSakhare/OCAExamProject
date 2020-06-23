package com.capgemini.oca.set2;

public class Question73 {

	int i;
	static int j ;
	public static void main(String[] args) {
		Question73 obj =new Question73();
		Question73 obj2 =new Question73();
		obj.i =3;
		obj.j = 4;
		
		
		obj2.i =5;
		obj2.j = 6;
		
		System.out.println("obj.i"+obj.i);
		System.out.println("obj.j"+obj.j);
		
		System.out.println("obj2.i"+obj2.i);
		System.out.println("obj2.j"+obj2.j);
	}
}
