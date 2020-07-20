package com.Spring;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("myhello")
	 public Hello createHello() {
	 System.out.println("-------createHello() ------ called");
	 Hello hello=Hello.getHello();
	 return hello;
	 }
	
	 @Bean("myruntime")
	 public Runtime createRT() {
	 System.out.println("-------createRT() ------ called");
	 Runtime rt=Runtime.getRuntime();
	 return rt;
	 } 

	
	
	
	
}
