package com.capgemini.oca.set1;

public class Question8 {

	public static void main(String[] args) {
		int arr[] = { 59, 2, 390, 4, 5 };
		int max_number = findMax(arr);
		System.out.println(max_number);
	}

	public static int findMax(int[] arr) {

		   int i;
		int max = arr[0]; 
        
       
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max; 

	}
}
