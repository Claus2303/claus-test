package de.claus.stream;

import java.util.function.Function;

import de.claus.stream.AdressDTO.Builder;

public class AdressEntity implements Function<AdressEntity,AdressDTO>{
	private String street;
	private String city;
	
	public AdressEntity() {	
	}
	
	private AdressEntity(AdressEntity.Builder builder) {
		this.street = builder.street;
		this.city = builder.city;
	}
	@Override
	public AdressDTO apply(AdressEntity t) {
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
        
        public AdressEntity build() {
        	AdressEntity adress =  new AdressEntity(this);
        	validateAdressObject(adress);
            return adress;
        }
        private void validateAdressObject(AdressEntity adress) {
        		//Prüfungen
        }
	}

}
