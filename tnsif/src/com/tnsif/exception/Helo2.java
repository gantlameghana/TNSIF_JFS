package com.tnsif.exception;

public class Helo2 {
	static void compute(int a) throws Helo
	{
		throw new Helo(a);
		
	}
	public static void main(String[] args) {
		try {
			compute(3);
		}
		catch(Helo e) {
			System.out.println("Exception");
		}
	}

}
