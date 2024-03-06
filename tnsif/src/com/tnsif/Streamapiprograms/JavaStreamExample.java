package com.tnsif.Streamapiprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
public static void main(String[] args) {
	List<Product>productlist = new ArrayList<Product>();
	productlist.add(new Product(1,"HP laptop",25000f));
	productlist.add(new Product(1,"Dell laptop",55000f));
	productlist.add(new Product(1,"Apple laptop",65000f));
//	List<Float> p2 = productlist.stream().filter(p->p.price>30000)//filtering data 
//.map(p->p.price)
//.collect(Collectors.toList());
	//System.out.println(p2);
	
	//sum by using collector method
	double totalprice = productlist.stream().collect(Collectors.summingDouble(product->product.price));
	System.out.println(totalprice);
	//find max product list
	Product p= productlist.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
 System.out.println(p.price);
 
 //find min product list
 Product s=productlist.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
 System.out.println(s.price);
 
 //count() method
 long count =productlist.stream().filter(product->product.price<60000).count();
System.out.println(count);
}

}
