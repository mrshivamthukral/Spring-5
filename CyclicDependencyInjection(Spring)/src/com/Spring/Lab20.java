package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab20 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("---------Now Spring Container is Ready-----"); 
		
	}

}
