package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab4 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("---------Now Spring Container is Ready-----");
		
		Hello hello=(Hello)ctx.getBean("myhello");
		hello.show();
		
		Runtime rt =(Runtime)ctx.getBean("myruntime");
		System.out.println(rt.availableProcessors()); 



		
		
		
		
	}

}
