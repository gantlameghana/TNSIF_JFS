package com.tnsif.exception;
//to demonstrate nested try
public class NestedTryblock {
	public static void check() {
		String str = "TNS";
		int slength = str.length();
		System.out.println("length of the string"+slength);
		String anotherstring = null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound"+e.getMessage());
				
			}
			System.out.println("String length"+anotherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception is thrown"+e.getMessage());
			
		}
		
	}

}
