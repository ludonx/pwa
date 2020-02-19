package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "error_report")
public class ErrorReport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String description;
	
	@ManyToOne
	private DailyReport daily_report_id;
	
	public ErrorReport() {
		super();
		this.type = "empty_type";
		this.description = "empty_description";
	}
	public ErrorReport(String type, String description) {
		super();
		this.type = type;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DailyReport getDaily_report_id() {
		return daily_report_id;
	}
	public void setDaily_report_id(DailyReport daily_report_id) {
		this.daily_report_id = daily_report_id;
	}

	
	
	
	


}
