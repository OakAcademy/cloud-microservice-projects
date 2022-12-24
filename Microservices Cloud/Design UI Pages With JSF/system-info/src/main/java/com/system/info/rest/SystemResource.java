package com.system.info.rest;

import jakarta.json.JsonArray;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@RequestScoped
@Path("/properties")
public class SystemResource {
 
 

 @GET
 @Path("/username")
 @Produces(MediaType.APPLICATION_JSON)
 public String getUsername() { 
     return System.getProperties().getProperty("user.name");
 }

 @GET
 @Path("/os")
 @Produces(MediaType.APPLICATION_JSON)
 public String getOS() { 
     return System.getProperties().getProperty("os.name");
 }

}
