package de.claus.cdi;

import java.util.ServiceLoader;

public class CDIDemo {
	public static void main(String[] args) {
		/**
		 * Der Partnerservice befindet sich unter META-INF/services als Datei ohne Endung
		 * Dort wird die Implementierung gesucht
		 */
		ServiceLoader<PartnerService> partnerServices = ServiceLoader.load( PartnerService.class );
		for ( PartnerService partner : partnerServices )
		  System.out.println( partner.getClass() + " : " + partner.hello() );
	}
}
