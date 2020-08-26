package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	@Autowired(required = false)
	 Hai hai; 

	 public void show() {
	 System.out.println(hai);
	 } 

	
	
	
}
