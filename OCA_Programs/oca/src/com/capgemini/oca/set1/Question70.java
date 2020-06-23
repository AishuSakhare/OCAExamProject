package com.capgemini.oca.set1;

public class Question70 {

	public static void main(String[] args) {
		String [][] chs = new String[5][2];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i =97;
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {

				chs[a][b] = "" + i;
				System.out.println("a = "+a+"b = "+b+"chs[a][b]"+chs[a][b]);
				i++;
			}
		}

		for (String[] st : chs) {
			System.out.println("st = length ="+st.length);
			for (String s : st) {
				System.out.println(s + " ");
			}
			System.out.println();
		}

		
	}
	
}
