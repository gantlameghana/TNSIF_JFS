package com.tnsif.exception;

import java.util.Scanner;

//to demostarete throw keyword
public class TestThrow {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the rollnumber");
		int rollno = s.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("rollnumber cannot be negative");
		}
		else
		{
			System.out.println("vaild rollnumber");
		}
	}

}
