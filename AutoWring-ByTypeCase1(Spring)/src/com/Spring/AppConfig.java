package com.Spring;

import org.springframework.beans.factory.annotation.Autowire;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	
	@Bean(name="myhello",autowire = Autowire.BY_TYPE) 
	public Hello createHello() {
		System.out.println("-------createHello() ------ called"); 
		Hello hello=new Hello();
		return hello;
	}
	
}
