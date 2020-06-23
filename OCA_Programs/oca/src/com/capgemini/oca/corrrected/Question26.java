package com.capgemini.oca.corrrected;

import java.util.ArrayList;
import java.util.List;

public class Question26 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("b");
		
		if(names.remove("b")) {
			names.remove("z");
		}
		
		System.out.println(names);
	}
}
