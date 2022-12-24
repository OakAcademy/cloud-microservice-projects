package com.example.citizen.rest.resource;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(configKey="nin.proxy")
@Path("/api/getNim")
public interface NINumberProxy {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	NINumber getNextNIN();
	
}
