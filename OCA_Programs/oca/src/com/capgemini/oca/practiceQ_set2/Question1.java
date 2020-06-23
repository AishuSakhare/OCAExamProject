package com.capgemini.oca.practiceQ_set2;

public class Question1 {

	public static void main(String[] args) {
		int [] [] array2D = {{0, 1, 2}, {3, 4, 5, 6}};
		
		System.out.println(array2D.length);
		
		for(int i = 0;i<array2D.length;i++) {
			for(int j=0;j<array2D[i].length;j++) {
				System.out.println("i = "+i+"j = "+j+"array 2D "+array2D[i][j]);
			}
		}
		System.out.print (array2D[0].length+ "" );
		System.out.print(array2D[1].getClass().isArray() + "");
		System.out.println (array2D[0][1]);
	}

}
