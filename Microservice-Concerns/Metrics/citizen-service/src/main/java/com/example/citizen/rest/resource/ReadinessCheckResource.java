package com.example.citizen.rest.resource;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.Path;

@Path("/citizenReady")
@Readiness
public class ReadinessCheckResource implements HealthCheck {

	@Inject
	@RestClient
	NINumberProxy ninproxy2;
	
	@Override
	public HealthCheckResponse call() {
		
		try {
			String someNumber = ninproxy2.getNextNIN().nin;
			
			return HealthCheckResponse.builder().name("citizen-ready").up().build();
			
		} catch (Exception e) {
			
			return HealthCheckResponse.builder().name("citizen-ready").down().build();
			// TODO: handle exception
		}
		
	}
	
	
}
