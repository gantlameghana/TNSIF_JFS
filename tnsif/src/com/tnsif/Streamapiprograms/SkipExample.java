package com.tnsif.Streamapiprograms;
import java.util.stream.Stream;
public class SkipExample {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(num->num%2==0)
		.limit(6)
		.forEach(num->System.out.println(num+""));
	}
}