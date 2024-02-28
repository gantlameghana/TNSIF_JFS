package com.tnsif.collections;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		System.out.println("size"+a.size());
		a.add(2);
		a.add("meghana");
		a.add(89.9);
		a.add(a);
		System.out.println(a);//list of collections
		System.out.println(a.contains(89.9));//to check whether the element is present or not
		System.out.println("check the list is empty or not  "+a.isEmpty());
		System.out.println("removing the element"+a.remove(3));
		System.out.println(a);
		
	}

}
