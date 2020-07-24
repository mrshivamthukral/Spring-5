package com.Spring;

import java.util.List;
import java.util.Set;

public class Customer {
	
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private List<String> emails;
	private Set<Integer> phones;
	
	
	public Customer() {
		super();
	}

	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Integer> getPhones() {
		return phones;
	}

	public void setPhones(Set<Integer> phones) {
		this.phones = phones;
	}

	
	

	public Customer(int cid, String cname, String email, long phone, List<String> emails, Set<Integer> phones) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.emails = emails;
		this.phones = phones;
	}



	public String toString() {
		 return cid + ", " + cname + ", " + email + ", " + phone;
		 } 

}
