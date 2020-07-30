package com.Spring;

import org.springframework.context.annotation.Bean;



public class AppConfig {
	
	@Bean("hai")
	public Hai createHai() {
		System.out.println("-------createHai() ------ called"); 
		return new Hai();
	}
	
	@Bean(name="hello")
	public Hello createHello(Hai hai) {
		System.out.println("-------createHello() ------ called"); 
		Hello hello=new Hello();
		hello.setHai(hai);
		return hello;
	}
	
}
