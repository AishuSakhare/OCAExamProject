package com.capgemini.oca.surprise_test;

public class Question12 {
	private void blastOff() {
		System.out.print("bang ");
	}
	public static void main(String[] args) {
		
	}
}

class Shuttle extends Question12 {
	public static void main(String[] args) {
		new Shuttle().go();
	}

	void go() {
		blastOff();
		// Rocket.blastOff(); // line A
	}

	private void blastOff() {
		System.out.print("sh-bang ");
	}
}
