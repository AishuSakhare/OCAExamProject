package com.capgemini.oca.practiceQ_set2;

public class Question2 {
	public String name = "";
	public int age = 0;
	public String major = "Undeclared";
	public boolean fulltime = true;

	public void display() {
		System.out.println("Name: " + name + " Major: " + major);
	}

	public boolean isFullTime() {
		return fulltime;
	}
	
	public static void main(String[] args) {
		
	}

}

 class TestStudent {
	public static void main(String[] args) {
		Question2 bob = new Question2();
		Question2 jian = new Question2();
		bob.name = "Bob";
		bob.age = 19;
		jian = bob;
		jian.name = "Jian";
		System.out.println("Bob's Name: " + bob.name);
	}
}

/*
 * public class Student { public String name = ""; public int age = 0; public
 * String major = "Undeclared"; public boolean fulltime = true; public void
 * display() { System.out.println("Name: " + name + " Major: " + major); }
 * public boolean isFullTime() { return fulltime; } }
 * 
 * Given:
 * 
 * public class TestStudent { public static void main(String[] args) { Student
 * bob = new Student (); Student jian = new Student(); bob.name = "Bob"; bob.age
 * = 19; jian = bob; jian.name = "Jian"; System.out.println("Bob's Name: " +
 * bob.name); } }
 * 
 * What is the result when this program is executed?
 */
