package com.Spring;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig {

	@Bean(name="myemails")
	public List<String> getEmails(){
		System.out.println("JLCAppConfig -getEmails()"); 
		List<String> ems= new ArrayList<>(); 
		 ems.add("sri@jlc");
		 ems.add("vas@jlc");
		 ems.add("sd@jlc"); 
		 return ems;
	}
	
	@Bean(name="myphones")
	public Set<Integer> getPhones(){
		System.out.println("JLCAppConfig -getPhones() "); 
		Set<Integer> phs=new TreeSet<>(); 
		 phs.add(111);
		 phs.add(222);
		 phs.add(333);
		 return phs; 
	}
	
	 @Bean(name="mycust")
	 public Customer createCustomer(List<String> myemails,Set<Integer> myphones) {

	 System.out.println("JLCAppConfig -createCustomer() ");
	 Customer cust=new Customer(101,"Srinivas","Sri@jlc.com",12345,myemails,myphones);
	 cust.setEmails(myemails);
	 cust.setPhones(myphones);
	
	 return cust;
	 } 

	 
	}

