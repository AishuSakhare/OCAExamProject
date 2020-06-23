package com.capgemini.oca.set1;

public class Question62 {

	public static void main(String[] args) {
		Question62Student[] stud = new Question62Student[3];
		stud[1] = new Question62Student("r");
		stud[2] = new Question62Student("d");
		
		for (Question62Student s : stud) {
			System.out.println(s.name);
		}
	}
}
