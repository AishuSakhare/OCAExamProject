package com.capgemini.oca.OCP_test_que;

public class Question19 {

	public static <T> int count(T[] array, T elem) {
		int count = 0;
		for (T e : array)
			if (((String) e).compareTo((String) elem) > 0)
				++count;
		return count;
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		int n = Question19.count(a, 3);
		System.out.println(n);
	}

}
