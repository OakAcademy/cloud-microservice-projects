package com.example.ticket.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.client.AccountServiceClient;
import com.example.client.dto.AccountDto;
import com.example.ticket.dto.TicketDto;
import com.example.ticket.entity.PriorityType;
import com.example.ticket.entity.Ticket;
import com.example.ticket.entity.TicketStatus;
import com.example.ticket.entity.elastic.TicketModel;
import com.example.ticket.repository.TicketElasticRepository;
import com.example.ticket.repository.TicketRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

	private final TicketRepository ticketRepository;
	private final TicketElasticRepository elasticRepository;
	private final ModelMapper modelMapper;
	private final AccountServiceClient accountserviceClient;
	private final TicketNotificationService ticketNotificationService;
	
	@Override
	@Transactional
	public TicketDto Save(TicketDto ticketDto) {
		Ticket ticket=new Ticket();
		ResponseEntity<AccountDto> accountclientDto=accountserviceClient.get(ticketDto.getAssignee());
		if(accountclientDto.getStatusCode().is2xxSuccessful())
		{
			ticket.setAssignee(accountclientDto.getBody().getId());
		}
		else
		{
			
		}
		
		//create ticket Entity
		
		
		if(ticketDto.getDescription()==null)
			throw new IllegalArgumentException("Please fill the Description area");
		ticket.setDescription(ticketDto.getDescription());
		ticket.setNotes(ticketDto.getNotes());
		ticket.setTicketDate(ticketDto.getTicketDate());
		ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus()));
		ticket.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));
		
		//save to MySQL
		ticket=ticketRepository.save(ticket);
		//create eleastic instance
		TicketModel model=TicketModel.builder().description(ticketDto.getDescription())
			.notes(ticketDto.getNotes())
			.id(ticket.getId())
			.assignee(accountclientDto.getBody().getNameSurname())
			.priorityType(ticket.getPriorityType().getLabel())
			.ticketStatus(ticket.getTicketStatus().getLabel())
			.ticketDate(ticketDto.getTicketDate()).build();
			
			
		//save elastic
		elasticRepository.save(model);
		//return dto
		ticketDto.setId(ticket.getId());
		ticketNotificationService.sendToQueue(ticket);
		return ticketDto;
	}



	@Override
	public TicketDto GetById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDto> Pagination() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public TicketDto Update(String id, TicketDto ticketDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
