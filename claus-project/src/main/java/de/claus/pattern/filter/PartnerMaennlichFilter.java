package de.claus.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class PartnerMaennlichFilter implements PartnerFilter{

	public List<Partner> filter(List<Partner> persons) {
		List<Partner> malePersons = new ArrayList<Partner>(); 

		for (Partner person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
   }
}
return malePersons;
	}

}
