package com.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
	
	@Bean(name="ao")
	public A createA() {
		A ao= new A();
		ao.setA(101);
		ao.setMsg("I am A");
		return ao;
	}
	
	@Bean("bo")
	public B createB() {
		B bo=new B(102,"I am B");
		return bo;
	}
	
	
}
