package com.tnsif.multithreading;

public class Synchronizedblock {
 void display() {
	 synchronized (this) {
		
	}
		Thread g =Thread.currentThread()	;
		for(int i=0;i<=3;i++) {
		try {
			Thread.sleep(1000);
			System.out.println(g.getName()+ " "+i);
		}
		catch(Exception e) {
		}
		}
	}

}
