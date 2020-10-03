package de.claus.japa.start.example01.entities;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Employee {
	@Id
	private int id;
	@Enumerated(EnumType.STRING)
	private Anrede anrede;
	@Column(name="TALASTNAME")
	private String name;
	//Standard ist EAGER
	@Basic(fetch = FetchType.LAZY)
	private long salary;
	@OneToMany(mappedBy = "employee")
	@OrderBy("zip desc")
	private Collection<Adress> adresses;
	//Wird nicht gespeichert
	private transient String anredetemp;
	
	public Employee() {}
	public Employee(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Anrede getAnrede() {
		return anrede;
	}
	public void setAnrede(Anrede anrede) {
		this.anrede = anrede;
	}
}
