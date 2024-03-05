package com.tnsif.lamdaexpression;

public class SquareDemo {
public static void main(String[] args) {
	Square s=(x)->{return (x*x);};
	System.out.println("Suqre of the number is:"+s.calculate(5));
}
}
