package com.capgemini.oca.OCP_test_que;

public class Question6 {
	public static void main(String[] args) {
		int a[] = { 011, 023, 053, 00454554 };
		int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
		System.out.print(a[3] == b[0][2]);
		System.out.println();
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.print("" + (a[2] == b[2][1]));
	}

}
