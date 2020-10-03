package de.claus.japa.start.example01.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "PLZ")
	private int zip;
	@Column(name = "STRASSE")
	private String street;
	@Column(name = "ORT")
	private String town;
}
