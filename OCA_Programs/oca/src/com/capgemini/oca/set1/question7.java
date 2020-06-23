package com.capgemini.oca.set1;

public class question7 {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String show() {
		return name + " " + age;
	}

	public question7(String name) {
		// TODO Auto-generated constructor stub
	}
	
	public question7(String name, int age) {
		//question7(name);		//line n2
		setAge(age);
	}

	public static void main(String[] args) {
		question7 p1 = new question7("abc");
		question7 p2 = new question7("xyz", 4);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
