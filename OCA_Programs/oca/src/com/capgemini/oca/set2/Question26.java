package com.capgemini.oca.set2;

public class Question26 {

	public static void main(String[] args) {
		String names[] = {"Thomas","Peter","asdfg"};
		String pwd[] =  new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2,6);
				System.out.println(pwd[idx]);
				idx++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid name");
		}
	}
}
