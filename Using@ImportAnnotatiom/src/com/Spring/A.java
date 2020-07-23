package com.Spring;

public class A {

	int a;
	String msg;
	
	static {
		System.out.println("A - S.B"); 

	}
	
	public A() {
		super();
		System.out.println("A - D.C"); 
	}

	public void setA(int a) {
		System.out.println("A - setA()"); 
		this.a = a;
	}

	public void setMsg(String msg) {
		System.out.println("A - setMsg()"); 
		this.msg = msg;
	}

	@Override
	public String toString() {
		return  " "+a + "\t" + msg;
	}
	
	
}
