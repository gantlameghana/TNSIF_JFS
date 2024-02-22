package com.tnsif.staticprogram;

public class Employee {
	int eid;
	String name;
	static String company="TNS";
	
	Employee(int e,String n){
		eid=e;
		name=n;
		
	}
	
void display() {
	System.out.println(eid+" "+name+" "+company);
}
}
