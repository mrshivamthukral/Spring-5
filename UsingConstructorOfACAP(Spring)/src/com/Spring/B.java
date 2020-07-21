package com.Spring;

public class B {

	int b;
	String str;
	
	static {
		System.out.println("B - S.B"); 

	}
	
	public B(int b,String str) {
		
		System.out.println("B - 2 args");
		this.b=b;
		this.str=str;
	}

	
	public String toString() {
		return  " "+b + "\t" + str;
	}
	
	
}
