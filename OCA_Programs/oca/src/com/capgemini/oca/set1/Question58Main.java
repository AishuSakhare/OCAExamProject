package com.capgemini.oca.set1;

public class Question58Main {

	public static void main(String[] args) {
		Question58abstarct obj1 = new Question58();
		Question58Interface  obj2 = new Question58();
		
		Question58abstarct s = (Question58abstarct) obj2;
		Question58Interface t = obj1;
		
		t.display();
		s.dispaly2();
	}
}
