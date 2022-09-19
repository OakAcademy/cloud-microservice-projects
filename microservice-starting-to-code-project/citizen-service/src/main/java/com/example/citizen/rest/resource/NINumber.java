package com.example.citizen.rest.resource;

import jakarta.json.bind.annotation.JsonbProperty;

public class NINumber {
	
	@JsonbProperty("ni_number")
	public String nin;

	public String getNin() {
		return nin;
	}
	
	
	

}
