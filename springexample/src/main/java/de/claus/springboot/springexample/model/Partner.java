package de.claus.springboot.springexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Partner {
	@JsonProperty("id")
	private int pa_id;
	@JsonProperty("surename")
	private String vorname;
	@JsonProperty("lastname")
	private String name;
	
	public Partner() {
		
	}
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPa_id() {
		return pa_id;
	}

	public void setPa_id(int pa_id) {
		this.pa_id = pa_id;
	}
}
