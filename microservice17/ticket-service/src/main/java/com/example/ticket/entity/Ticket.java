package com.example.ticket.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ticket")
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntity {
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private String id;
	@Getter
	@Setter
	@Column(name="description",length=600)
	private String description;
	@Getter
	@Setter
	@Column(name="notes",length = 500)
	private String notes;
	@Getter
	@Setter
	@Column(name="assignee",length = 50)
	private String assignee;
	@Getter
	@Setter
	@Column(name = "ticket_date")
	private Date ticketDate;
	@Getter
	@Setter
	@Enumerated(EnumType.ORDINAL)
	private TicketStatus ticketStatus;
	@Getter
	@Setter
	@Enumerated(EnumType.ORDINAL)
	private PriorityType priorityType;

}