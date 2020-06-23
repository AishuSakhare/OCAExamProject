package com.capgemini.oca.OCP_test_que;

public class Question16 {

	private int count = 0;

	private Question16() {
	};

	public static final Question16 getInstance() {
		return new Question16();
	};

	public void add(int i) {
		count += i;
	};

	public int getCount() {
		return count;
	};

	public static void main(String[] args) {

	}
}

class Program {
	public static void main(String[] args) {
		Question16 s1 = Question16.getInstance();
		s1.add(3);
		Question16 s2 = Question16.getInstance();
		s2.add(2);
		Question16 s3 = Question16.getInstance();
		s2.add(1);
		System.out.println(s1.getCount() + s2.getCount() + s3.getCount());
	}
}
