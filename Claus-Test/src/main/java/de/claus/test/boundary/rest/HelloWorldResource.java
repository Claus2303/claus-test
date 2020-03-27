package de.claus.test.boundary.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldResource {

	@GET
	public String hello() {
		return "Hello World";
	}
}
