package com.example.citizen.rest.resource;

import jakarta.json.bind.annotation.JsonbProperty;

public class NINumber {

	@JsonbProperty("ni_number")
	public String nin;

	@Override
	public String toString() {
		return "NINumber [nin=" + nin + "]";
	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}
	
	
	
}
