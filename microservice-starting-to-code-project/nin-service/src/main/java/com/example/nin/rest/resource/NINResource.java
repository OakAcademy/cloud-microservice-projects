package com.example.nin.rest.resource;

import com.example.nin.rest.NINRepo;
import com.example.nin.rest.model.NINumber;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getNim")
public class NINResource {

	@Inject
	private NINRepo ninRepo;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public NINumber generateCitizenNumber() {
		NINumber niNumber = new NINumber();
		niNumber.setNin(ninRepo.getNextId());
		return niNumber;
	}
	
	
}
