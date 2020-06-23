package set1Demo;

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	static int num1;
	static int num2;

	public static void EnterChoice() {
		String choice;
		System.out.println("Enter your choice");
		System.out.println("press 1 for addition");
		System.out.println("press 2 for substraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		choice = sc.nextLine();

		if (choice.equals("1")) {
			addition();
			EnterChoice();
		} else if (choice.equals("2")) {
			substraction();
		} else if (choice.equals("3")) {
			multiplication();
		} else if (choice.equals("4")) {
			division();
		} else {
			System.err.println("please enter correct choice");
			EnterChoice();
		}
	}

	public static void EnterNumber() {
		try {
			System.out.println("Enter 1st Number");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd Number");
			num2 = sc.nextInt();
		} catch (Exception e) {
			System.err.println("Enter correct number from EnterNumber()");
		}

	}

	public static void addition() {
		
			int output = num1 + num2;

			System.out.println("Sum of two number" + output);
		
	}

	public static void division() {

		try {
			int output = num1 / num2;

			System.out.println("division of two number" + output);
		} catch (Exception e) {
			System.err.println("please enter correct number which will divisible ");
			EnterNumber();

		}

	}

	public static void substraction() {
		int output = num1 - num2;

		System.out.println("substraction of two number" + output);
	}

	public static void multiplication() {
		int output = num1 * num2;

		System.out.println("multiplication of two number" + output);
	}

	public static void main(String[] args) {
		EnterChoice();
	}
}
