package com.Spring;

public class Account {

	private int accno;
	private String acctype;
	private Double bal;
	
	public Account() {
		
	}

	public Account(int accno, String acctype, Double bal) {
		
		this.accno = accno;
		this.acctype = acctype;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return  accno + "," + acctype + "," + bal;
	}
	
	
}
