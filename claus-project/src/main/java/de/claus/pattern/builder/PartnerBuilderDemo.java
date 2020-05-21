package de.claus.pattern.builder;

public class PartnerBuilderDemo {
	public static void main(String[] args) {
	    Partner partner1 = new Partner.PartnerBuilder("Claus", "Schäffner")
	    	    .age(43)
	    	    .phone("1237166034")
	    	    .address("AM Kressenacker Forchheim")
	    	    .build();
	    	 
	    	    System.out.println(partner1);
	    	 
	    	    Partner partner2 = new Partner.PartnerBuilder("Philipp", "Schäffner")
	    	    	    .age(10)
	    	    	    .phone("7166034")
	    	    	    .build();

	    	 
	    	    System.out.println(partner2);
	    	 
	    	    Partner partner3 = new Partner.PartnerBuilder("Hannah", "Schäffner")
	    	    //No age
	    	    //No phone
	    	    //no address
	    	    .build();
	    	 
	    	    System.out.println(partner3);
	}
}
