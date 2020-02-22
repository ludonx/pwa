package com.model.automate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Long street_number;
	private String street_description;
	private String city;
	private String state;
	
	public Address() {
		super();
		this.street_number = (long)0;
		this.street_description = "empty_street_description";
		this.city = "empty_city";
		this.state = "empty_state";
	}
	public Address(Long street_number, String street_description, String city, String state) {
		super();
		this.street_number = street_number;
		this.street_description = street_description;
		this.city = city;
		this.state = state;
	}
	public Long getStreet_number() {
		return street_number;
	}
	public void setStreet_number(Long street_number) {
		this.street_number = street_number;
	}
	public String getStreet_description() {
		return street_description;
	}
	public void setStreet_description(String street_description) {
		this.street_description = street_description;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
