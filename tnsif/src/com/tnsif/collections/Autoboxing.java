package com.tnsif.collections;

public class Autoboxing {
	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly
		Integer j=a; //another method for autoboxing
		System.out.println(a+ " "+i+ " "+j);
	}

}
