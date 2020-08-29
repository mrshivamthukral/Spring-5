package com.Spring;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	@Bean(name="myhello")
	 public Hello createHello() {
	 return new Hello();
	 } 
	
}
