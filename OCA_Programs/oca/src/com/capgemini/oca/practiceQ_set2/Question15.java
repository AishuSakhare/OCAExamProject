package com.capgemini.oca.practiceQ_set2;

public class Question15 {

	public static void main(String[] args) {
		String message1 = "Wham bam!";
		String message2 = new String("Wham bam!");
		if (message1 == message2)
		System.out.println("They match");
		if (message1.equals(message2))
		System.out.println("They really match");
	}
}
