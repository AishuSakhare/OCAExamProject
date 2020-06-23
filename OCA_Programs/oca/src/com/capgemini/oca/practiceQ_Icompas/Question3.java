package com.capgemini.oca.practiceQ_Icompas;

public class Question3 {

}

class B extends Testa {
	public void getData() {
		System.out.println("Hiii");
	}
}

 class Testa {

	public static void main(String[] args){
		Testa t=new B();
	  B b=new B();
	//  t.getData();//Line 1
	  ((B) t).getData(); //Line 2
	  ///((B)) t.getData();//Line3
	  b.getData();//Line4
	 }
}
