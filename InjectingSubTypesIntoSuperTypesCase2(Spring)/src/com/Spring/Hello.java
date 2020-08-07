package com.Spring;

public class Hello {

	private A aobj;
	private CustomerDAO customerDAO;
	
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	public void show() {
		System.out.println(aobj);
		 customerDAO.addCustomer(); 
	}
	
}
