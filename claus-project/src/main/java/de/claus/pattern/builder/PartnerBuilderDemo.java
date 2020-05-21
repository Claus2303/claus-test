package de.claus.pattern.builder;

public class PartnerBuilderDemo {
	public static void main(String[] args) {
		
	    Partner partner1 = Partner.Builder.newInstance()
	    		.firstName("Claus")
	    		.lastName("Schäffner")
	    	    .age(43)
	    	    .phone("1237166034")
	    	    .address("AM Kressenacker Forchheim")
	    	    .build();
	    	 
	    	    System.out.println(partner1);
	    	 
	    	    Partner partner2 = Partner.Builder.newInstance()
	    	    		.firstName("Philipp")
	    	    		.lastName("Schäffner")
	    	    	    .age(10)
	    	    	    .phone("7166034")
	    	    	    .build();

	    	 
	    	    System.out.println(partner2);
	    	 
	    	    Partner partner3 = Partner.Builder.newInstance()
	    	    		.firstName("Hannah")
	    	    		.lastName("Schäffner")
	    	    		.build();
	    	 
	    	    System.out.println(partner3);
	}
}
