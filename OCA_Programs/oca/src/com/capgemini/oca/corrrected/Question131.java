package com.capgemini.oca.corrrected;

public class Question131 {

	int a1;

	public static void product(int a) {
		a = a * a;
	}

	public static void string(StringBuilder sb) {
		System.out.println("........inside");
		System.out.println("..1" + sb);
		System.out.println("..2" + sb.toString());
		sb.append(" " + sb);
		System.out.println("...3" + sb);
		System.out.println("......inside");
	}

	public static void main(String[] args) {
		Question131 items = new Question131();
		items.a1 = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		product(i);
		System.out.println("..before calling" + sb);
		string(sb);
		System.out.println(".....afer calling " + sb);
		product(items.a1);
		System.out.println("....." + i + ".." + sb + "..." + items.a1);
		
		String arr[]= new String[4];
		arr[2] = "4";
		arr[3] = "5";
		for (String j : arr) {
			System.out.println(j);
		}
	}
}
