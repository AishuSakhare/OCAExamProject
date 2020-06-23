package com.capgemini.oca.OCA_SET1;

public class Question18 {

	String name = "Java";
	
	
}

class University {
	public static void main(String[] args) {
		Question18 c[] = { new Question18(), new Question18() };

		c[0].name = "oca";

		for (Question18 q : c)
			q = new Question18();
		
		for(Question18 q : c)
			System.out.println(q.name);
	}
}
