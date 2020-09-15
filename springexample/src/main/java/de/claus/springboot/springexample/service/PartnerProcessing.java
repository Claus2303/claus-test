package de.claus.springboot.springexample.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.claus.springboot.springexample.model.Partner;

@RestController
@RequestMapping(value = "/partner")
public class PartnerProcessing {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getPartner(@PathVariable("id") String orderId) {
		Partner partner = new Partner();
		partner.setName("Schäffner");
		partner.setVorname("Claus");
		partner.setPa_id(1);
		return ResponseEntity.ok(partner);
	}
}
