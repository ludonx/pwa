package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class AutomateInformation {
	private String state;
	private Double temperature;
	
	private PaymentState  payment_state;
	
	public AutomateInformation() {
		super();
		this.state = "empty_state";
		this.temperature = (double) 0;
		this.payment_state = new PaymentState();
	}
	
	public AutomateInformation(String state, Double temperature, PaymentState payment_state) {
		super();
		this.state = state;
		this.temperature = temperature;
		this.payment_state = payment_state;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public PaymentState getpayment_state() {
		return payment_state;
	}

	public void setpayment_state(PaymentState payment_state) {
		this.payment_state = payment_state;
	}
	
	
	

}
