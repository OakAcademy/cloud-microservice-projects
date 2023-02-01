package com.example.ticket.entity;

import lombok.Getter;

@Getter
public enum PriorityType {
URGENT("Urgent"),
LOW("Low"),
HIGH("High");
	
	PriorityType(String label) {
	this.label=label;
}

	private String label;
}
