package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab8 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("---------Now Spring Container is Ready-----");
		
		Customer cust=(Customer) ctx.getBean("mycust");
		
		System.out.println(cust);
		System.out.println(cust.getEmails());
		System.out.println(cust.getPhones());
		System.out.println(cust.getRefs());
		System.out.println(cust.getAddress());
		
		for(Account acc:cust.getAccounts()) {
		 System.out.println(acc);
		} 


	}

}
