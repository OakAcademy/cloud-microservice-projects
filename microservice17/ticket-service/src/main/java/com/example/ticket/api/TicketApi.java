package com.example.ticket.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.dto.TicketDto;
import com.example.ticket.service.TicketService;

import lombok.RequiredArgsConstructor;

@RequestMapping("ticket")
@RestController
@RequiredArgsConstructor
public class TicketApi {

	private final TicketService ticketService;
	
	@GetMapping("/{id}")
	public ResponseEntity<TicketDto> getById(@PathVariable String id)
	{
		return ResponseEntity.ok(ticketService.GetById(id));
	}
	@PostMapping
	public ResponseEntity<TicketDto> Save(@RequestBody TicketDto ticketDTO)
	{
		return ResponseEntity.ok(ticketService.Save(ticketDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<TicketDto> Update(@PathVariable String id, @RequestBody TicketDto ticketDto)
	{
		return ResponseEntity.ok(ticketService.Update(id, ticketDto));
	}
	
	@GetMapping
	public ResponseEntity<List<TicketDto>> getAll()
	{
		return ResponseEntity.ok(ticketService.Pagination());
	}
	
	
	
	
	
}
