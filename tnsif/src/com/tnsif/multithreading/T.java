package com.tnsif.multithreading;

public class T extends Thread
{
	Syncronization e;
	T(Syncronization e){
		this.e=e;
		
	}
	public void run() {
		e.display();
		
	}
}
