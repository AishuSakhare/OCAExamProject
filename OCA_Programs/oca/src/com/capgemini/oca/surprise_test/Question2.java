package com.capgemini.oca.surprise_test;

public class Question2 {
	private int x = 4;

	public static void main(String[] args) {
		//protected int x = 6;
		new Question2().new Cell().slam();
	}

	class Cell {
		void slam(){ System.out.println("throw away key "  );
	 }
	}
}
