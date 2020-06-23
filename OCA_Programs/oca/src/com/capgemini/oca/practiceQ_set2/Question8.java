package com.capgemini.oca.practiceQ_set2;

import java.io.IOException;

public class Question8 {

	public static void main(String[] args) {
		try {
			doSomething();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	static void doSomething() throws IOException {
		if (Math.random() > 0.5) {
			throw new IOException();
		}
		throw new RuntimeException();
	}
}
