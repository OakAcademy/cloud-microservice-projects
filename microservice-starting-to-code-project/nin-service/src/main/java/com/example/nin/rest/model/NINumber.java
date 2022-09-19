package com.example.nin.rest.model;

import jakarta.json.bind.annotation.JsonbProperty;

public class NINumber {
	@JsonbProperty("ni_number")
	private String nin;

	@Override
	public String toString() {
		return "NINumber [nim=" + nin + "]";
	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}
	
	
}
