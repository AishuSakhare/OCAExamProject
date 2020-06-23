package com.capgemini.oca.set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question19 {

	public static void main(String[] args) {
		String[] arr = { "hi", "how", "are", "you" };

		List<String> arrList = new ArrayList<>(Arrays.asList(arr));

		if(arrList.removeIf(s->
		{
			System.out.println(s);
			System.out.println(s.length());
			return s.length() <= 1;
		}))
		{
			System.out.println("removed");
		}
	}
}