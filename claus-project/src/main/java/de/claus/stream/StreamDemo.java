package de.claus.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		System.out.println(list);
		
		List<PartnerDTO> dtolist = list.stream()
		.map(PartnerDTO::new)
		.filter(partnerdto -> "Claus".equals(partnerdto.getVorname()))
		.collect(Collectors.toList());
		
		System.out.println(dtolist);
	}
}
