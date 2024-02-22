package com.tnsif.staticprogram;

public class Student1 {
	int rollno;
	String name;
	static String college="BIT";
	
	static void change() {
		college="sreyas";
	}
	Student1(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

}
