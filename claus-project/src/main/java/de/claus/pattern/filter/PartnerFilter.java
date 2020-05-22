package de.claus.pattern.filter;

import java.util.List;

public interface PartnerFilter {
	
	public List<Partner> filter(List<Partner> persons);
}
