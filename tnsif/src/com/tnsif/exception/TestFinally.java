package com.tnsif.exception;
//with no exception
public class TestFinally {
	public static void main(String[]args) {
		try {
			System.out.println("Welcome");
		}
		catch(Exception e) {
			System.out.println("Hello");
		}
		finally {
			System.out.println("Hello java");
		}
	}

}
