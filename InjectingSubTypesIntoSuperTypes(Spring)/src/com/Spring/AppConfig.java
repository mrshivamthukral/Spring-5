package com.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class AppConfig {
	
//	@Bean(name="ao")
//	public A createA() {
//		A ao= new A();
//		return ao;
//	}
	
	@Bean("bo")
	public B createB() {
		B bo=new B();
		return bo;
	}
	
	@Bean(name="cdao") 
	public CustomerDAO createCustomerDAO() {
		return new CustomerDAOImpl();
	}
	
	@Bean(name="myhello",autowire = Autowire.BY_TYPE) 
	public Hello createHello() {
		Hello h=new Hello();
		return h;
	}
}
