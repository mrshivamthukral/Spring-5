package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("---------Now Spring Container is Ready-----"); 

		Hello hello1=(Hello)ctx.getBean("hello");
		Hello hello2=(Hello)ctx.getBean("hello");
		System.out.println(hello1==hello2);
		
		Hai hai1=(Hai)ctx.getBean("hai");
		Hai hai2=(Hai)ctx.getBean("hai");
		System.out.println(hai1==hai2);
		
		Hello hello=(Hello)ctx.getBean("hello");
		hello.showHello();
		
		Hai hai=(Hai)ctx.getBean("hai");
		hai.showHai(); 

		
		
		
		
	}

}
