package com.capgemini.oca.set2;

import java.util.Iterator;

public class Question27 {

	public static void main(String[] args) {
		int data[]= {1,2,3,4,5,4};
		int key =4;
		int count =0;
		
		for (int i : data) {
			if(i!=key) {
				continue;
				//count++;
			}
		}
	}
}
