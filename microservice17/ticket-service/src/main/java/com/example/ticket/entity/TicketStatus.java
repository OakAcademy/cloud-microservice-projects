package com.example.ticket.entity;

import lombok.Getter;

@Getter
public enum TicketStatus {
OPEN("Open"),
IN_PROGRESS("In_progress"),
RESOLVED("Resolved"),
CLOSED("Closed");
	
	TicketStatus(String label) {
	this.label=label;
}

	private String label;
	
}

