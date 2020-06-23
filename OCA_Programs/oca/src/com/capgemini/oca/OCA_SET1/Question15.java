package com.capgemini.oca.OCA_SET1;

import java.util.ArrayList;

public class Question15 {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		
		s.add(1, "abc");
		s.add(2, "abc");
		s.add(3, "abc");
		s.add(4, "abc");
		
		s.remove(2);
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
