package com.tnsif.multithreading;

public class ImplementingRunnable implements Runnable {
	public static void main(String[] args) {
		ImplementingRunnable r = new ImplementingRunnable(); //new start
		Thread t = new Thread(r);
		t.start();
		System.out.println(t.getName());
	
		
	}

	@Override
	public void run() {
		System.out.println("welcome java");
		
	}

}
