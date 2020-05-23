package de.claus.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctionInterfaceDemo {
	public static void main(String[] args) {
		
		List<AdressEntity>list = new ArrayList<AdressEntity>();
		list.add(AdressEntity.Builder.newInstance()
							.city("Forchheim")
							.street("Am Kressenacker")
							.build());
		list.add(AdressEntity.Builder.newInstance()
				.city("Forchheim")
				.street("Bahnhofsplatz")
				.build());
		
		System.out.println(list);
		List<AdressDTO> dtolist = list.stream()
		.map(AdressEntity.Builder.newInstance().build())//--> Implementiert das Function Interface
		.collect(Collectors.toList());
		
		System.out.println(dtolist);
	}
}
