package com.capgemini.oca.corrrected;

public class Question18 {

	public static void main(String[] args) {
		String shirt[][] = new String[2][2];
		shirt[0][0]= "red";
		shirt[0][1]= "blue";
		shirt[1][0]= "small";
		shirt[1][1]= "mediumn";
		
		for(int i=0;i<2;) {
			for(int j=0;j<2;) {
				System.out.println(shirt[i][j]);
				j++;
			}
			i++;
		}
		
		
	}
}
