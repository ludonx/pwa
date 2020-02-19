package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class AutomateInformation {
	private String state;
	private Double temperature;
	
	private PaymentState  paymentState;
	
	public AutomateInformation() {
		super();
		this.state = "empty_state";
		this.temperature = (double) 0;
		this.paymentState = new PaymentState();
	}
	
	public AutomateInformation(String state, Double temperature, PaymentState paymentState) {
		super();
		this.state = state;
		this.temperature = temperature;
		this.paymentState = paymentState;
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

	public PaymentState getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(PaymentState paymentState) {
		this.paymentState = paymentState;
	}
	
	
	

}
