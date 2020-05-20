package de.claus.enumeration;

public class EnumerationDemo {
	public static void main(String[] args) {
		EnumerationTest t1 = EnumerationTest.ALLES;
		EnumerationTest t2 = EnumerationTest.EHEPARTNER;
		EnumerationTest t3 = EnumerationTest.VERHEIRATED;
		
		System.out.println(t1+t1.getDescription()+t1.getTyp());
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		System.out.println(t3.ordinal());
		
		System.out.println(t1.name());
		System.out.println(t2.name());
		System.out.println(t3.name());
		
		System.out.println(t1.values());
		for(EnumerationTest e: t1.values()) {
		System.out.println(e);
		}
		/**
		 * ALLESAlle Rollen0
EHEPARTNER
VERHEIRATED
0
1
2
ALLES
EHEPARTNER
VERHEIRATED
[Lde.claus.enumeration.EnumerationTest;@15db9742
ALLES
EHEPARTNER
VERHEIRATED
		 */
	}
}
