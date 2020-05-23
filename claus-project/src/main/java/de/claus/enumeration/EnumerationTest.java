package de.claus.enumeration;

public enum EnumerationTest {
	ALLES(0, "Alle Rollen"),
	EHEPARTNER(1, "Ehepartner"),
	VERHEIRATED (3, "Verheirated mit");
	
	Integer typ;
	String description;
	
	private EnumerationTest(Integer typ, String description){
		this.typ = typ;
		this.description = description;
	}
	public Integer getTyp() {
		return typ;
	}

	public void setTyp(Integer typ) {
		this.typ = typ;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public EnumerationTest getEnumerationTest(Integer typ) {
		switch (typ) {
		case 0:
			return EnumerationTest.ALLES;
		case 1:
			return EnumerationTest.EHEPARTNER;					
		case 2:
			return EnumerationTest.VERHEIRATED;
		default:
			throw new IllegalArgumentException("Übergebener Parameter nicht im Wertebereich");
		}
	}
}
