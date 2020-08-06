package com.Spring;

import org.springframework.beans.factory.annotation.Autowire;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean("myhai1")
	 public Hai createHai1() {
	 Hai hai1=new Hai();
	 return hai1;
	 } 
	
	@Bean("myhai2")
	 public Hai createHai2() {
	 Hai hai2=new Hai();
	 return hai2;
	 } 
	
	@Bean("hai")
	 public Hai createHai3() {
	 Hai hai3=new Hai();
	 return hai3;
	 } 
	
	@Bean(name="myhello",autowire = Autowire.BY_TYPE) 
	public Hello createHello() {
		System.out.println("-------createHello() ------ called"); 
		Hello hello=new Hello();
		return hello;
	}
	
}
