package de.claus.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public class PartnerDemo {
	public static void main(String[] args) {
		Partner p = new Partner();
		p.setAge(77);
		p.setEmail("claus@test..de");

		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

		Set<ConstraintViolation<Partner>> constraintViolations = validator.validate( p );

		for ( ConstraintViolation<Partner> violation : constraintViolations )
		  System.out.println( violation.getPropertyPath() + " " + violation.getMessage() );
	
		/**
		 * Es können auch einzelne Properties validiert werden
		 * 	Set<ConstraintViolation<Player>> ageViolation =
                                   validator.validateProperty( p, "age" );
			if ( ! ageViolation.isEmpty() )
  					System.out.println( new ArrayList<ConstraintViolation<Player>>(ageViolation)
                    .get( 0 ).getMessage() );
		 * 
		 */
	
		/**
		 *  Oder eigene Validator defindert werden
		 * 	constraintViolations = v.validate( p, DialogPlayer.NameValidation.class );
			for ( ConstraintViolation<DialogPlayer> violation : constraintViolations )
  				System.out.println( violation.getPropertyPath() + " " + violation.getMessage() );
		 * 
		 */
	}
}
