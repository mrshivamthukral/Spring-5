package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab9 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("---------Now Spring Container is Ready-----");
		
		Customer cust=(Customer) ctx.getBean("mycust");
		
		System.out.println(cust);
		System.out.println(cust.getEmails());
		System.out.println(cust.getPhones());
		


	}

}
