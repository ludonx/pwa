package com.model;

public class Article {
	private String name;
	private Long quantity;
	
	public Article() {
		super();
		this.name = "empty_name";
		this.quantity = (long) 0;
	}
	public Article(String name, Long quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
}
