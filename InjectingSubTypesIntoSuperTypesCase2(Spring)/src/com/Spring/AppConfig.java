package com.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name="aobj")
	public A createA() {
		A ao= new A();
		return ao;
	}
	
	@Bean("mybo")
	public B createB() {
		B bo=new B();
		return bo;
	}
	
	@Bean(name="customerDAO") 
	public CustomerDAO createCustomerDAO() {
		return new CustomerDAOImpl();
	}
	
	@Bean(name="myhello",autowire = Autowire.BY_NAME) 
	public Hello createHello() {
		Hello h=new Hello();
		return h;
	}
}
