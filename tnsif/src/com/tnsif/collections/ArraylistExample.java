package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("banana");
		list.add("grapes");
		list.add("papaya");
		list.add("watermelon");
		System.out.println(list);
		//Travesing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) { //check if iterator has element
			System.out.println(itr.next()); //printing the element
		}
	}

}
