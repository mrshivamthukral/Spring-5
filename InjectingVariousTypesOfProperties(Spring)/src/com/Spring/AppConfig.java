package com.Spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
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
	
	 @Bean(name="myrefs") 
	 public Map<String,Integer> getRefs(){
		System.out.println("JLCAppConfig -getRefs()");
		 Map<String,Integer> refs=new TreeMap<>();
		 refs.put("A",11);
		 refs.put("B",22);
		 refs.put("C",33);
		 refs.put("D",44);
		 return refs; 

	}

	 @Bean(name="myprops")
	public Properties getProps() {
		System.out.println("JLCAppConfig -getProps()");
		 Properties props=new Properties(); 
		 props.put("A",11);
		 props.put("B",22);
		 props.put("C",33);
		 props.put("D",44); 
		return props;
	}
	 
	 @Bean(name="myadd")
	 public Address getAdd() {
	 System.out.println("JLCAppConfig -getAdd() ");
	 Address add=new Address();
	 add.setStreet("BTM Layout");
	 add.setCity("Bangalore");
	 add.setState("KA");
	 return add;
	 } 

	 
	 @Bean(name="myaccs")
	 public List<Account> getAccounts(){
	 
		 System.out.println("JLCAppConfig -getAccounts() ");
	 
	 List<Account> myaccs=new ArrayList<>();
	myaccs.add(new Account(101,"SA",15000.0));
	myaccs.add(new Account(102,"CA",25000.0));
	 myaccs.add(new Account(103,"DA",35000.0));
	 return myaccs;
	 } 

	 @Bean(name="mycust")
	 public Customer createCustomer(List<String> myemails,Set<Integer> myphones,
	 Map<String,Integer> myrefs,Properties myprops,Address myadd,
	 List<Account> myaccs) {

	 System.out.println("JLCAppConfig -createCustomer() ");
	 Customer cust=new Customer(101,"Srinivas","Sri@jlc.com",12345);
	 cust.setEmails(myemails);
	 cust.setPhones(myphones);
	 cust.setRefs(myrefs);
	 cust.setMyprops(myprops);
	 cust.setAddress(myadd);
	 cust.setAccounts(myaccs);
	 return cust;
	 } 

	 
	}

