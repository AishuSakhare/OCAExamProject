package com.capgemini.oca.OCP_test_que;

public class Question20 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

//			static {
//				System.out.println("initial");
//			}

			@Override
			public void run() {
				System.out.println("start");
			}
		});

		th.start();
	}

}
