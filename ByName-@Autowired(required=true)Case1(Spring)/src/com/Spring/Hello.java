package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Hello {
	
	@Autowired
	@Qualifier("myhai")
	 Hai hai; 

	 public void show() {
	 System.out.println(hai);
	 } 

	
	
	
}
