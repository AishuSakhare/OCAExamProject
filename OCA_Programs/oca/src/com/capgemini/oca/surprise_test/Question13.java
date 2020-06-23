package com.capgemini.oca.surprise_test;

public class Question13 {

	Short story = 200;

	Question13 go(Question13 cb) {

		cb = null;
		return cb;
	}

	public static void main(String[] args) {
		Question13 c1 = new Question13();
		Question13 c2 = new Question13();
		Question13 c3 = c1.go(c2);
		c1 = null;
		// do Stuff
	}
}
