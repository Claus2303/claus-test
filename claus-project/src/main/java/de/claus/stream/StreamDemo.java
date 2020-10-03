package de.claus.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<PartnerEntity> list = new ArrayList<PartnerEntity>();
		
		PartnerEntity dto = new PartnerEntity();
		dto.setGeburtsdatum(new Date(System.currentTimeMillis()));
		dto.setName("Schäffner");
		dto.setFirstname("Claus");
		
		PartnerEntity dto1 = new PartnerEntity();
		dto1.setGeburtsdatum(new Date(System.currentTimeMillis()));
		dto1.setName("Schäffner");
		dto1.setFirstname("Tanja");
		
		PartnerEntity dto2 = new PartnerEntity();
		dto2.setGeburtsdatum(new Date(System.currentTimeMillis()));
		dto2.setName("Schäffner");
		dto2.setFirstname("Philipp");
		
		PartnerEntity dto3 = new PartnerEntity();
		dto3.setGeburtsdatum(new Date(System.currentTimeMillis()));
		dto3.setName("Schäffner");
		dto3.setFirstname("Claus");
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		long count = list.stream().distinct().count();
		//Filterbeispiel
		Stream<PartnerEntity> stream = list.stream()
										   .filter(element -> element.getFirstname().contains("a"));
		
		System.out.println(list);
		
		List<PartnerDTO> dtolist = list.stream()
		.map(PartnerDTO::new) //--> das geht wegen dem Konstruktor PartnerDTO(PartnerEntity p)
		.filter(partnerdto -> "Claus".equals(partnerdto.getVorname()))
		.filter(partnerdto -> "Schäffner".equals(partnerdto.getName()))
		.collect(Collectors.toList());
		
		System.out.println(dtolist);
	}
}
