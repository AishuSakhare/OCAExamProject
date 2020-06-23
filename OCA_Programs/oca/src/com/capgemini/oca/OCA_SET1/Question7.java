package com.capgemini.oca.OCA_SET1;

public class Question7 {

}

class Father extends Question7 {
	public void dance() throws ClassCastException {

	}
}

class Home {
	public static void main(String[] args) {
		Question7 obj = new Question7();
		try {
			((Father) obj).dance();
		} finally {

		}
	}
}
