package com.example.ticket.service;

import java.util.List;

import com.example.ticket.dto.TicketDto;

public interface TicketService {

	TicketDto Save(TicketDto ticketDto);
	TicketDto Update(String id, TicketDto ticketDto);
	TicketDto GetById(String id);
	List<TicketDto> Pagination();
}