package com.tnsif.interacedemo;
//outer interface
public interface Myinterface {
	void calculatearea();
	
	//inner interface nested interface
	interface Myinnerinterface{
		int id=20;
		
		void print();
		
	}

}
