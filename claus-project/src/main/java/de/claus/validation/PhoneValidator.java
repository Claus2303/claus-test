package de.claus.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneConstraint, String>{

	private String matcher;
	
	
    public void initialize(PhoneConstraint contactNumber) {
    	System.out.println(contactNumber);
    }
    
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean bnull = (value == null);
		if (!bnull) {
			boolean bmatch = value.matches("[0-9]+");
	        boolean min = value.length()>8;
	        boolean max = value.length()<14;
	        return bmatch && min && max;
		}
		return false;
		
	}

}
