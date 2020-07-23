package com.Spring;

public class Address {

	private String Street;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public void setStreet(String street) {
		Street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return  Street + "," + city + "," + state;
	}
	
	
	
}
