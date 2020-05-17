package de.claus.validation;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Partner {
	
	/**
	 * Eigene Validator
	 * @author claus
	 *
	 */
	public interface NameValidation { }
	public interface AgeValidation extends NameValidation { }
	
	
	@NotNull (message="muss ungleich null sein", groups = NameValidation.class )
	private String name;
	private String vorname;
	@Min(value = 10,  groups = AgeValidation.class)
	@Max(value = 110, groups = AgeValidation.class)
	private int age;
	@Email @NotNull
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
