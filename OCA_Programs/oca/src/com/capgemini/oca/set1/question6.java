package com.capgemini.oca.set1;

public class question6 {

	
	public static void main(String[] args) {

	
		question6planet [] obj ={
				new question6planet("mercury", 0),
				new question6planet("venus", 0),
				new question6planet("earth", 1),
				new question6planet("mars", 2)
		};
		
		System.out.println(obj);
		System.out.println(obj[2]);
		System.out.println(obj[1].name);
		System.out.println(obj[2].moon);
		
		
	}

}
