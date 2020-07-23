package com.Spring;

public class Hai {

	A aobj;
	B bobj;
	
	static {
		System.out.println("Hai - S.B"); 

	}
	
	public Hai() {

		System.out.println("Hai() - D.C"); 
		this.bobj=bobj;
	}

		public void setAobj(A aobj) {
			System.out.println("Hai- setAobj() ");
			this.aobj = aobj;
		 }
	
	    public void setBobj(B bobj) {
	    	System.out.println("Hai- setBobj() ");
	    	this.bobj = bobj;
		 } 

	
	public void show() {
		 System.out.println("Hai-show()");
		 System.out.println(aobj);
		 System.out.println(bobj);
		}
	
	
}
