package com.capgemini.oca.practiceQ_Icompas;

public class Question28 {

	public static void main(String[] args) {
		int mask = 0;
		int count = 0;
		if (((5 < 7) || (++count < 10)) | mask++ < 10) {
			mask = mask + 1;
			System.out.println(mask);
		}
		if ((6 > 8) ^ false) {
			mask = mask + 10;
			System.out.println(mask);
		}
		if (!(mask > 1) && ++count > 1) {
			mask = mask + 100;
			System.out.println(mask);
		}
		System.out.println(mask + " " + count);
	}

}
