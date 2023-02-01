package com.example.ticket.entity.elastic;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode(of = { "id" })
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "ticket")
public class TicketModel implements Serializable {
	@Id
	private String id;
	private String description;
	private String notes;
	private String assignee;
	private Date ticketDate;
	private String priorityType;
	private String ticketStatus;
}

