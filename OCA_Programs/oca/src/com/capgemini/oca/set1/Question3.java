package com.capgemini.oca.set1;

public class Question3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int length = arr.length;
		
		do {
			length--;
			System.out.println(arr[length]);
		}
		while(length>0);
		
		
		while(length>0) {
			
			System.out.println(arr[--length]);
		}
	}
}
