package com.capgemini.oca.OCP_test_que;

import java.lang.reflect.Executable;

public class Question13 {

	
	public static void main(String[] args) {
	Runnable r = () ->System.out.println("running");
	
		Thread th = new Thread();
		th.start();
	}
}
