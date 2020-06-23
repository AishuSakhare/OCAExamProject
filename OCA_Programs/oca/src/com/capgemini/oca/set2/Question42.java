package com.capgemini.oca.set2;

public class Question42 {

	public static void main(String[] args) {
		String[] strs = {"a","b"};
		
		int idx =0;
		
		for (String s : strs) {
			strs[idx].concat("element"+idx);
			idx++;
		}
		
		for(idx =0;idx<strs.length;idx++) {
			System.out.println(strs[idx]);
		}
	}
}
