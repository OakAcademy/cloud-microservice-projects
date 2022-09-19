package com.example.citizen.rest.resource;

import java.time.Instant;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.example.citizen.rest.model.Citizen;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/registerCitizen")
public class CitizenResource {
	
	@Inject
	@RestClient
	NINumberProxy ninproxy;
	
	
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String registerCitizen() { return
	 * "The citizen registered"; }
	 */
	 
	
	
	
	  @POST
	  @Produces(MediaType.APPLICATION_JSON)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED) public Response
	  registerCitizen(@FormParam("name") String name, @FormParam("surname") String surname, @FormParam("birthDate") String birthDate, @FormParam("motherName") String
	  motherName, @FormParam("fatherName") String fatherName) {
	  
	try {
			  Citizen citizen = new Citizen(); 
			  citizen.setName(name); 
			  citizen.setSurname(surname);   
			  citizen.setBirthDate(Instant.parse(birthDate));
			  citizen.setMotherName(motherName);  
			  citizen.setFatherName(fatherName); 
			  citizen.setNINumber(ninproxy.getNextNIN().nin); 
			  ninproxy.close(); 
			  return Response.status(201).entity(citizen).build(); 
			    
		 } catch(Exception e) {  
			 
			 return Response.status(500).build();
		 }
		  
    
  
	  
	  }
	 
	 
	
}
