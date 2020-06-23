package com.capgemini.oca.corrrected;

public class Question24 {

	public static void main(String[] args) {
		String[][] chs = new String[2][];
		
		for (String[] strings : chs) {
			System.out.println(strings);
			
		}
		System.out.println(".........................");
		chs[0] = new String[2];
		chs[1] = new String [5];
		int i=97;
		
		for (String[] strings : chs) {
			System.out.println(strings);
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}
		System.out.println(".......................");
		for(int a=0;a<chs.length;a++) {
			for(int b=0;b<chs.length;b++) {
				chs[a][b]=""+i;
				i++;
				System.out.println("a"+a+"b"+b+"chs[a][b]"+chs[a][b]);
			}
		}
		System.out.println(".........................");
		for (String[] strings : chs) {
			System.out.println(strings);
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}
	}
}
