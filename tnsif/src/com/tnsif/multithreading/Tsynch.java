package com.tnsif.multithreading;

public class Tsynch {
	public static void main(String[] args) {
		Syncronization s=new Syncronization();
		T t1=new T(s);
	    T t2=new T(s);
	    T t3=new T(s);
	    
	    t1.start();
	    t2.start();
	    t3.start();
}
}