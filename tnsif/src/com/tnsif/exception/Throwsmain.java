package com.tnsif.exception;

import java.io.IOException;

public class Throwsmain {
	public static void main(String[] args) {
		ThrowsDemo t = new ThrowsDemo();
		try {
			t.display();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
