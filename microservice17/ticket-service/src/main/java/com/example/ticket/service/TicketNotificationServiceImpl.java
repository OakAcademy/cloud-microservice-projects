package com.example.ticket.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.messagging.TicketNotification;
import com.example.ticket.entity.Ticket;

import lombok.RequiredArgsConstructor;

@Service
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class TicketNotificationServiceImpl  implements TicketNotificationService{

	private final Source source;
	@Override
	public void sendToQueue(Ticket ticket) {
		TicketNotification ticketNotification=new TicketNotification();
		ticketNotification.setAccountId(ticket.getAssignee());
		ticketNotification.setTicketId(ticket.getId());
		ticketNotification.setTicketDescription(ticket.getDescription());
		source.output().send(MessageBuilder.withPayload(ticketNotification).build());
		
	}

}

