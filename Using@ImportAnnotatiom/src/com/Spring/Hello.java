package com.Spring;

public class Hello {

	A aobj;
	B bobj;
	
	static {
		System.out.println("Hello - S.B"); 

	}
	
	public Hello() {
		System.out.println("Hello() - D.C");
	}
	public Hello(A aobj,B bobj) {

		System.out.println("Hello(A,B) - 2arg"); 
		this.aobj=aobj;
		this.bobj=bobj;
	}

	

	
	public void show() {
		 System.out.println("Hello-show()");
		 System.out.println(aobj);
		 System.out.println(bobj);
		}
	
	
}
