package com.tnsif.StringDemo;

public class ImmutabaleDemo {
public static void main(String[] args) {
	String s="gantla";
	String s2=s;
	String s3=s;
	System.out.println("before modification");
	System.out.println("s "+s);
	System.out.println("s2 "+s2);
	System.out.println("s3 "+s3);
	s="meghana";
	System.out.println("after modification");
	System.out.println("s "+s);
	System.out.println("s2 "+s2);
	System.out.println("s3 "+s3);
}

}
