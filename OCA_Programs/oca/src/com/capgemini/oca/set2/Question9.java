package com.capgemini.oca.set2;

public class Question9 {

	public static void doSum(Integer x,Integer y) {
		System.out.println("Integer");
	}
	
	public static void doSum(double x,double y) {
		System.out.println("double");
	}
	public static void doSum(float x,float y) {
		System.out.println("float");
	}
	
	public static void main(String[] args) {
		//doSum(10, 10);
		doSum(10.0, 20.0);
	}
}
