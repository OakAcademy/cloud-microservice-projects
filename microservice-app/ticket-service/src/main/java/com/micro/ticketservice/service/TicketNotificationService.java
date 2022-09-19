package com.micro.ticketservice.service;

import com.micro.ticketservice.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
