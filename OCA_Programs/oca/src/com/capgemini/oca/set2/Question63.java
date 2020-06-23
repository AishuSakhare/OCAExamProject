package com.capgemini.oca.set2;

public class Question63 {

	public static void main(String[] args) {
		Caller obj = new Caller();
		obj.start();
		///obj.init();
	}

}

class Caller{
	private void init() {
		System.out.println("init");
	}
	
	protected void start() {
		init();
		System.out.println("start");
	}
}

