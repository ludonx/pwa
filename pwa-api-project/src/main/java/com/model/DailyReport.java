package com.model;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "daily_report")
@Entity
@Table(name = "daily_report")
public class DailyReport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Long serial_number;
	
	private Date report_date;
	private String status;
	
    private AutomateInformation automate_information ;
    
    //@XmlElementWrapper(name = "errors")
    //@XmlElement(name="error")
    //@OneToMany(mappedBy = "daily_report_id", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "daily_report_id", nullable = false, updatable = false)
    private List<ErrorReport> errors;

    //@XmlElementWrapper(name = "articles")
    //@XmlElement(name="article")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "daily_report_id", nullable = false, updatable = false)
	private List<Article> articles;
	
    
	private Long income;

//	//---------------------------------------------------
//	@ManyToOne(fetch = FetchType.EAGER) 
//	@JoinColumn(name = "automate_serial_number", insertable = false, updatable = false)
//	private Automate automate_serial_number;
//	
//	@JsonIgnore
//	public Automate getAutomate_serial_number() {
//		return automate_serial_number;
//	}
//
//	public void setAutomate_serial_number(Automate automate_serial_number) {
//		this.automate_serial_number = automate_serial_number;
//	}
//	//----------------------------------------------------
	
	public DailyReport() {
		super();
	}

	public DailyReport(Long serial_number, Date report_date, String status, Long income) {
		super();
		this.serial_number = serial_number;
		this.report_date = report_date;
		this.status = status;
		this.income = income;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(Long serial_number) {
		this.serial_number = serial_number;
	}

	public Date getReport_date() {
		return report_date;
	}

	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}

	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public AutomateInformation getAutomate_information() {
		return automate_information;
	}

	public void setAutomate_information(AutomateInformation automate_information) {
		this.automate_information = automate_information;
	}
	
	public List<ErrorReport> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorReport> errors) {
		this.errors = errors;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}
	
	
}
