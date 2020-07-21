package com.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean(name="myhello")
	public Hello CreateHello(A ao,B bo) {
		Hello h=new Hello(ao,bo);
		return h;
	}
	
	
}
