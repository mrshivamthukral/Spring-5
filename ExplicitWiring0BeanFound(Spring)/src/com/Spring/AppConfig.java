package com.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
	
	@Bean(name="hello")
	@Scope("singleton")
	public Hello createHello(Hai hai) {
		System.out.println("-------createHello() ------ called"); 
		Hello hello=new Hello();
		hello.setHai(hai);
		return hello;
	}
	
}
