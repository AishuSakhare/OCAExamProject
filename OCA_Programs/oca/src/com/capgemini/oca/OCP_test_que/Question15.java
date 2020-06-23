package com.capgemini.oca.OCP_test_que;

import java.io.Console;
import java.io.IOException;

public class Question15 {

	public static void main(String[] args) throws IOException{
		Console c = System.console();
		int i = Integer.parseInt(c.readLine());
		System.out.println(i);
		for (int j = 0; j < i; j++) {
			c.format("%2d", j);
		}
	}
}
