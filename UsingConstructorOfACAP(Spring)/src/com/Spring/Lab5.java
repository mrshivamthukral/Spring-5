package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab5 {

	public static void main(String[] args) {
		//With Spring
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig1.class,AppConfig2.class,AppConfig3.class);
		
		System.out.println("---------Now Spring Container is Ready-----"); 
		
		Hello h=(Hello)ctx.getBean("myhello");
		h.show();
		
		Hai hai=(Hai)ctx.getBean("myhai");
		hai.show();
	}

}
