package com.capgemini.oca.practiceQ_Icompas;

public class Question18 {

	public static void main(String[] args) {
		Box b1 = new Box(5);
		Box[] ba = go(b1, new Box(6));
		System.out.println(ba[0].size+" "+ ba[1].size);
		ba[0] = b1;
		System.out.println(b1.size);
		System.out.println(ba[0].size+" "+ ba[1].size);
		for (Box b : ba)
			System.out.print(b.size + " ");
	}

	static Box[] go(Box b1, Box b2) {
		b1.size = 4;
		Box[] ma = { b2, b1 };
		System.out.println(b2.size+" "+ b1.size);
		return ma;
	}

}

class Box {
	int size;

	Box(int s) {
		size = s;
	}
}