package com.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
	
	@Bean(name="hello",autowire = Autowire.BY_TYPE)
	public Hello createHello() {
		System.out.println("-------createHello() ------ called"); 
		return new Hello();
	}
	
	@Bean(name="hai",autowire = Autowire.BY_TYPE)
	public Hai createHai() {
		System.out.println("-------createHai() ------ called"); 
		return new Hai();
	}
	
	
	
	
}
