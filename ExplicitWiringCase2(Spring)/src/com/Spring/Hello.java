package com.Spring;

public class Hello {
	
	private Hai hai;
	
	static {
		System.out.println("Hello - S.B"); 

	}
	
	public Hello() {
		System.out.println("Hello - D.C"); 
	}

	public void setHai(Hai hai) {
		System.out.println("Hello - setHai()"); 
		this.hai = hai;
	}

	public void show() {
		 System.out.println("Hello-show()");
		 System.out.println(hai);
		 } 

	
	
	
}
