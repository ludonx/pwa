package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class PaymentState {
	private String coins;
	private String smart_card;
	private String card;
	
	public PaymentState() {
		super();
		this.coins = "empty_coins";
		this.smart_card = "empty_smart_card";
		this.card = "empty_card";
	}
	public PaymentState(String coins, String smart_card, String card) {
		super();
		this.coins = coins;
		this.smart_card = smart_card;
		this.card = card;
	}
	public String getCoins() {
		return coins;
	}
	public void setCoins(String coins) {
		this.coins = coins;
	}
	public String getSmart_card() {
		return smart_card;
	}
	public void setSmart_card(String smart_card) {
		this.smart_card = smart_card;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	
	
	
}
