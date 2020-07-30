package com.Spring;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	@Bean("hai1")
	public Hai createHai1() {
		System.out.println("-------createHai1() ------ called"); 
		return new Hai();
	}
	
	@Bean("hai2")
	public Hai createHai2() {
		System.out.println("-------createHai2() ------ called"); 
		return new Hai();
	}
	
	@Bean(name="hello")
	public Hello createHello(Hai hai2) {
		System.out.println("-------createHello() ------ called"); 
		Hello hello=new Hello();
		hello.setHai(hai2);
		return hello;
	}
	
}
