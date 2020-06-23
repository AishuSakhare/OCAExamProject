package com.capgemini.oca.set2;

public class Question29 {

	public static void main(String[] args) {
		int num[][] = new int[3][1];
		for(int i=0;i<num.length;i++) {
			System.out.println("length = ="+num[i].length);
			for(int j =0;j<num[i].length;j++) {
				num[i][j]=10;
				System.out.println("i = "+i+"j= "+j+"value =  "+num[i][j]);
			}
		}
	}
}
