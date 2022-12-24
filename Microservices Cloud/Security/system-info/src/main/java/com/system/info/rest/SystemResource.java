package com.system.info.rest;

import jakarta.json.JsonArray;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.annotation.security.RolesAllowed;

import java.util.logging.Logger;

import org.eclipse.microprofile.jwt.Claim;

@RequestScoped
@Path("/properties")
public class SystemResource {
 
	private static Logger logger = Logger.getLogger(SystemResource.class.getName());

 @Inject
 @Claim("groups")
 private JsonArray roles;
 

 @GET
 @Path("/username")
 @Produces(MediaType.APPLICATION_JSON)
 @RolesAllowed({ "admin", "user" })
 public String getUsername() { 
	 logger.info("user info retrieved : "+System.getProperties().getProperty("user.name"));
     return System.getProperties().getProperty("user.name");
 }

 @GET
 @Path("/os")
 @Produces(MediaType.APPLICATION_JSON)
 @RolesAllowed({ "admin" })
 public String getOS() { 
     return System.getProperties().getProperty("os.name");
 }

 @GET 
 @Path("/jwtroles") 
 @Produces(MediaType.APPLICATION_JSON) 
 @RolesAllowed({ "admin", "user" }) 
 public String getRoles() {
	 return roles.toString();
 }
}
