package com.tnsif.collections;

public class Unboxing {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		int i=a.intValue();//conerting Integer to int
		int j =a;
		System.out.println(a+"  "+i+" "+j);
	}

}
