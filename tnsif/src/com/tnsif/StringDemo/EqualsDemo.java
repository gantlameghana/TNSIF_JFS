package com.tnsif.StringDemo;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1="meghana";
		String s2="meghana";
		String s3=new String("meghana");
		String s4="ramya";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
