package com.capgemini.oca.corrrected;

public class Question147 {

	public static void main(String[] args) {

		Vehical obj = new car(20);
		System.out.println(obj.toString());
	}
}

class Vehical {
	int x;

	Vehical() {
		this(10);
	}

	Vehical(int x) {
		this.x = x;
	}
}

class car extends Vehical {

	int y;

	car() {
		super(10);
	}

	car(int y) {
		super(y);
		this.y = y;
	}

	@Override
	public String toString() {
		return "car [y=" + this.y + ", x=" + super.x + "]";
	}

//	public String tostring() {
//		return super.x + " " + this.y;
//	}


}