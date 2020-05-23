package de.claus.stream;

import java.util.function.Function;

public class AdressDTO implements Function<AdressDTO, AdressEntity>{
	private String street;
	private String city;
	
	public AdressDTO() {	
	}
	
	private AdressDTO(AdressDTO.Builder builder) {
		this.street = builder.street;
		this.city = builder.city;
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public AdressEntity apply(AdressDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	public static class Builder{
		
		private String street;
		private String city;
		
		public static Builder newInstance() {
        	return new Builder();
        }
        private Builder() {
        }
        
        public Builder street(String street) {
        	this.street = street;
        	return this;
        }
        
        public Builder city(String city) {
        	this.city = city;
        	return this;
        }
        
        public AdressDTO build() {
        	AdressDTO adress =  new AdressDTO(this);
        	validateAdressObject(adress);
            return adress;
        }
        private void validateAdressObject(AdressDTO adress) {
        		//Prüfungen
        }
	}


	
}
