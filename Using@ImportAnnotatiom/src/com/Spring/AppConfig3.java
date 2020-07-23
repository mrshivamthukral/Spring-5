package com.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
	
	@Bean(name="myhai")
	public Hai CreateHai(A ao,B bo) {
		Hai hai=new Hai();
		hai.setAobj(ao);
		hai.setBobj(bo);
		return hai;
	}
	
	
}
