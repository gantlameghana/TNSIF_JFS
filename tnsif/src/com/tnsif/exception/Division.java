package com.tnsif.exception;

public class Division {
	public static void divide() {
		int a=6,b=0,c;
		try {
			c=a/b;
		
		}
		catch(ArithmeticException e) {
			System.out.println("exception welcome"+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println("exception caught"+e.getMessage());
		
			
		}
	}

}
