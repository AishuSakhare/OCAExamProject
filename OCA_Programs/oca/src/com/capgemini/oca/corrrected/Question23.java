package com.capgemini.oca.corrrected;

public class Question23 {
public static void main(String[] args) {
	int x = 100;
	int a = x++;
	System.out.println("a"+a);
	int b =++x;
	System.out.println("b"+b);
	int c=x++;
	System.out.println("c"+c);
	int d =(a<b)? (a<c)?a:(b<c)?b:c:c;
	System.out.println("d"+d);
}
}
