package com.capgemini.oca.OCP_test_que;

public class Question12 {

	protected void a(){
		System.out.println("question12");
	}
}

class sub extends Question12{
	public void a() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		sub obj = new sub();
		obj.a();
	}
}
