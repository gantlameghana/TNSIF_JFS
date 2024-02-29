package com.tnsif.collections;

import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		LinkedList<Integer> s = new LinkedList<Integer>();
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(8);
		System.out.println(s);
		LinkedList<Integer> s2 = new LinkedList<Integer>();
		s2.add(12);
		s2.add(14);
		s2.add(16);
		s2.add(18);
		s.addAll(s2);
		System.out.println(s);
		s2.addFirst(22);
		s2.addLast(33);
		System.out.println(s2);
		s2.remove(2);
		System.out.println(s2);
	}

}
