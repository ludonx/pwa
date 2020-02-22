package com.model.automate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "automate")
public class Automate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long serial_number;
	private String type;
	private Address address_installation;
	
	private String emplacement;
	private Coordinated coordinated;
	
	private Date intervention_date;
	private String note;
//	//---------------------------------------------------
//	@OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "automate_serial_number", nullable = false, updatable = false)
//	List<DailyReport> dailyReports;
//	//---------------------------------------------------
	public Automate() {
		super();
		
		this.type = "empty_type";
		this.address_installation = new Address();
		this.emplacement = "empty_emplacement";
		this.coordinated = new Coordinated();
		this.intervention_date = new Date();
		this.note = "empty_note";
	}
	public Automate(String type, Address address_installation, String emplacement,
			Coordinated coordinated, Date intervention_date, String note) {
		super();

		this.type = type;
		this.address_installation = address_installation;
		this.emplacement = emplacement;
		this.coordinated = coordinated;
		this.intervention_date = intervention_date;
		this.note = note;
	}
	public Automate(Long serial_number, String type, Address address_installation, String emplacement,
			Coordinated coordinated, Date intervention_date, String note) {
		super();
		this.serial_number = serial_number;
		this.type = type;
		this.address_installation = address_installation;
		this.emplacement = emplacement;
		this.coordinated = coordinated;
		this.intervention_date = intervention_date;
		this.note = note;
	}
	public Long getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(Long serial_number) {
		this.serial_number = serial_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress_installation() {
		return address_installation;
	}
	public void setAddress_installation(Address address_installation) {
		this.address_installation = address_installation;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public Coordinated getCoordinated() {
		return coordinated;
	}
	public void setCoordinated(Coordinated coordinated) {
		this.coordinated = coordinated;
	}
	public Date getIntervention_date() {
		return intervention_date;
	}
	public void setIntervention_date(Date intervention_date) {
		this.intervention_date = intervention_date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	

}
