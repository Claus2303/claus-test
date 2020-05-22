package de.claus.stream;

import java.util.Date;

public class PartnerDTO {
	private String name;
	private String vorname;
	private Date birth;
	
	public PartnerDTO() {
		
	}
	
	public PartnerDTO(PartnerEntity entity) {
		this.name = entity.getName();
		this.vorname = entity.getFirstname();
		this.birth = entity.getGeburtsdatum();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "PartnerDTO [name=" + name + ", vorname=" + vorname + ", birth=" + birth + "]";
	}

	

}
