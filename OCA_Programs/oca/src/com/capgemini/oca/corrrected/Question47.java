package com.capgemini.oca.corrrected;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question47 {

	public static void checkAge(List<Person> list, Predicate<Person> pre) {
		for (Person person : list) {
			if (pre.test(person)) {
				System.out.println(person.name);
			}
		}
	}

	public static void main(String[] args) {
		List<Person> iLIst = Arrays.asList(new Person("a", 45), new Person("b", 40), new Person("c", 38));
		checkAge(iLIst, p -> p.getAge() > 40);
	}

}

class Person {
	String name;
	int age;

	public Person(String n, int a) {
		name = n;
		age = a;
	}

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

}
