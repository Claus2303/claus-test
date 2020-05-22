package de.claus.stream;

import java.util.Date;

public class PartnerEntity {
	private String name;
	private String firstname;
	private Date geburtsdatum;
	
	public PartnerEntity() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	@Override
	public String toString() {
		return "PartnerEntity [name=" + name + ", firstname=" + firstname + ", geburtsdatum=" + geburtsdatum + "]";
	}
	
	
}
