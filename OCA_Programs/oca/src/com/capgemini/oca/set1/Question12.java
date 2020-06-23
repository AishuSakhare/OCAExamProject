package com.capgemini.oca.set1;

public class Question12 {

	static int x;
	static int y;
	
	public void dostuff(int x,int y) {
		x =x;
		y = this.y;
		
	}
	
	public void display() {
		System.out.println("x..."+x);
		System.out.println("y..."+y);
	}
	
	public static void main(String[] args) {
		Question12 obj =new Question12();
		obj.x =100;
		obj.y =200;
		
		Question12 obj2 = new Question12();
		obj2.dostuff(obj.x, obj.y);
		obj.display();
		obj2.display();
	}
}
