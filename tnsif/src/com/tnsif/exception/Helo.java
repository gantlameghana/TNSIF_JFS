package com.tnsif.exception;

public class Helo extends Exception{
	int detail;
	Helo(int a){
		detail=a;
	}
	public String tostring() {
		return "detail";
	}

}
