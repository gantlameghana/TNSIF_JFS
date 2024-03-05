package com.tnsif.lamdaexpression;

import java.util.ArrayList;

//to demostrate the lambda exp for collections
public class LambdaCollection {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(9);
		li.add(99);
		li.add(2);
		li.add(4);
		//for each loop
		//for(Integer ele:li) {
			//System.out.println(ele);
		
		//}
		li.forEach(element -> System.out.println(element));
		
	}

}
