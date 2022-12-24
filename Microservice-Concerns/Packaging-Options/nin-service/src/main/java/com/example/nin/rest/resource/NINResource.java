package com.example.nin.rest.resource;

import java.util.logging.Logger;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Metered;
import org.eclipse.microprofile.metrics.annotation.Timed;

import com.example.nin.rest.NINRepo;
import com.example.nin.rest.model.NINumber;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getNim")
public class NINResource {
	
	private static Logger logger = Logger.getLogger(NINResource.class.getName());

	@Inject
	private NINRepo ninRepo;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Timed(name = "generateCitizenNumber.timer", absolute = true , displayName = "generateCitizenNumber Timer",
	description = "Time taken by generateCitizenNumber.")
	@Metered(name = "generateCitizenNumberMeter", displayName = "generateCitizenNumber call frequency",
	description = "Rate the throughput of generateCitizenNumber.")
	@Counted(name="generateCitizenNumber", absolute = true, displayName = "generateCitizenNumber call count",
	description = "Number of times we generated the number")
	public NINumber generateCitizenNumber() {
		NINumber niNumber = new NINumber();
		niNumber.setNin(ninRepo.getNextId());
		logger.info("the number is :"+niNumber.getNin());
		return niNumber;
	}
	
}
