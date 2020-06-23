package com.capgemini.oca.set1;

public class Question49 {

	public static void main(String[] args) {
		String arr[][]= new String[2][2];
		
		arr[0][0]="red";
		arr[0][1]="yellow";
		arr[1][0]="blue";
		arr[1][1]="white";
		
		
		
		for (String[] strings : arr) {
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}
		
	}
}
