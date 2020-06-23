package com.capgemini.oca.corrrected;

public class Question92 {

	public static void main(String[] args) {
		String names[]= {"thomas","peter","joseph"};
		String pwd [] = new String[3];
		int idx =0;
		try {
			System.out.println("..............1.............");
			for(String n:names) {
				System.out.println("..............2.............");
				pwd [idx] = n.substring(2,6);
				System.out.println(".pwd[idx]"+pwd[idx]);
				System.out.println("..............3.............");
				idx++;
			}
		} catch (Exception e) {
		System.out.println("invalid");
		}
		
		for(String p :pwd) {
			System.out.println("..............4.............");
			System.out.println(p);
		}
	}
}
