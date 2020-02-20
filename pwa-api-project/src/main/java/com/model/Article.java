package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "article")
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long quantity;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "daily_report_id", insertable = false, updatable = false)
	private DailyReport dailyReport_id;
	
	@JsonIgnore
	public DailyReport getDailyReport_id() {
		return dailyReport_id;
	}
	public void setDailyReport_id(DailyReport dailyReport_id) {
		this.dailyReport_id = dailyReport_id;
	}
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
