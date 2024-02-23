package com.tnsif.exception;
//without matching catch block
public class Test2 {
	public static void main(String[]args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		finally {
			System.out.println("End");
		}
	}

}
