package de.claus.cdi;

import java.util.ServiceLoader;

public class CDIDemo {
	public static void main(String[] args) {
		ServiceLoader<PartnerService> partnerServices = ServiceLoader.load( PartnerService.class );
		for ( PartnerService partner : partnerServices )
		  System.out.println( partner.getClass() + " : " + partner.hello() );
	}
}
