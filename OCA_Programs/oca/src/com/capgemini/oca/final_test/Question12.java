package com.capgemini.oca.final_test;

import java.util.Map;
import java.util.TreeMap;

public class Question12 {
	public static void main(String[] args) {
		String[] words = new String[] { "aaa", "bbb", "ccc", "aaa" };
		Map<String, Integer> m = new TreeMap<String, Integer>();
		for (String word : words) {
			Integer freq = m.get(word);
			m.put(word, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
