package com.capgemini.oca.set2;

public class Question32 {

	public static void main(String[] args) {
		String[][] arr = { { "a", "b", "c" }, { "d", "e" } };
		// String [][] arr = new String[3][2];
		System.out.println("first for loop length" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("length" + arr[i].length);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("i = " + i + "j = " + j + "value = " + arr[i][j] + " ");
				if (arr[i][j].equals("b")) {
					continue;
				}
			}
			continue;
		}
	}
}
