package com.Spring;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name="myhai1")
	 public Hai createHai1() {
	 Hai hai=new Hai();
	 hai.setMsg("I am Hai Bean 1");
	 return hai;
	 }

	 @Bean(name="myhai2")
	 public Hai createHai2() {
	 Hai hai=new Hai();
	 hai.setMsg("I am Hai Bean 2");
	 return hai;
	 }

	 @Bean(name="hai")
	 public Hai createHai() {
	 Hai hai=new Hai();
	 hai.setMsg("I am also Hai Bean");
	 return hai;
	 } 

	
	@Bean(name="myhello")
	 public Hello createHello() {
	 return new Hello();
	 } 
	
}
