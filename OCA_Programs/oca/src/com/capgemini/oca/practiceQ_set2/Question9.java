package com.capgemini.oca.practiceQ_set2;

public class Question9 {

	String str = "default";
	Question9(String s)
	{
	str = s;
	}
	void print ()
	{
	System.out.println(str);
	}
	public static void main(String[] args)
	{
	new Question9("hello").print();
	}
}
