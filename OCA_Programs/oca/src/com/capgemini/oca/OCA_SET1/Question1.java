package com.capgemini.oca.OCA_SET1;

public class Question1 {
public static void main(String[] args) {
	Phone obj1= new Phone();
	Phone obj2 = new Smart();
	
	obj1.call();
	obj2.call();
	
	
}

}

class Phone {
	void call() {
		System.out.println("phone");
	}
	
	int a  = 10;
}

class Smart extends Phone {
	void call() {
		System.out.println("smart");
	}
}
