package com.capgemini.oca.set1;

public class Question14 {

	public static void main(String[] args) {
		int [][] arr = new int[2][4];
		
		arr[0] = new int[] {1,3,5,7};
		arr[1] = new int[] {1,3};
		
		for(int[]a:arr) {
			System.out.println("..........");
			System.out.println(a);
			System.out.println("..........");
			for(int i=0;i<arr.length;i++) {
				System.out.println(a[i]+" ");
			}
		}	
	}
}

// 13
// 13
