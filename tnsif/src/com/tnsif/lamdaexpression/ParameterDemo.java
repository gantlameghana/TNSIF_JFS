package com.tnsif.lamdaexpression;
//with parameter
public class ParameterDemo {
public static void main(String[] args) {
	Cube c =(a)->{return (a*a*a);};
	System.out.println("cube of the number is:"+c.calculate(2));
}
}
