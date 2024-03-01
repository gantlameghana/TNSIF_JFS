package com.tnsif.exception;

public class Output {
	public static void main(String[] args) {
		try{
			int a,b;
			b=0;
			a=5;
			int c=b/a;
			System.out.println("A");
		}
		catch(Exception e) {
			System.out.println("B");
		}
	}
}
