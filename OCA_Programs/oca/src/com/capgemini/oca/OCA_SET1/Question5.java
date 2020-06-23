package com.capgemini.oca.OCA_SET1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Question5 {

}

class Emp extends Question5{
	
}

class Maintest {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new String("1234"));
		list.add(new Question5());
		list.add(new Emp());
		list.add(new String[] {"a","b"});
		list.add(LocalDate.now().plus(1, null));
	}
}
