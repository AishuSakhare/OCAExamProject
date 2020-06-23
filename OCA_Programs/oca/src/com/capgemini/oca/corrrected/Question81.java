package com.capgemini.oca.corrrected;

public class Question81 {

	int x;
	int y;
	public void doStuff(int x,int y) {
		this.x =x;
		y = this.y;
		//this.y = y;
	}
	
	public void display() {
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		Question81 obj1 =new Question81();
		obj1.x =100;
		obj1.y =200;
		Question81 obj2 = new Question81();
		obj2.doStuff(obj1.x, obj1.y);
		obj1.display();
		obj2.display();
	}
}
